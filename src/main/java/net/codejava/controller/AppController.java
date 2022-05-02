package net.codejava.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.codejava.services.DealsService;
import net.codejava.Usuario;
import net.codejava.entity.Formulario;
import net.codejava.entity.Deals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private DealsService service;

    @RequestMapping("/")
    public String viewHomePage(HttpSession session, Model model) {

        if (session.getAttribute("mySessionAttribute") != null) {
            List<Deals> listDeals = service.listAll();
            model.addAttribute("listDeals", listDeals);
            return "index";
        } else {
            model.addAttribute("formulario", new Formulario());
            return "login";
        }
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        session.setAttribute("mySessionAttribute", "Bienvenido");

        return "redirect:/";
    }

    @RequestMapping("/new")
    public String showNewDealsPage(Model model) {
        Deals Deal = new Deals();
        model.addAttribute("Deals", Deal);

        return "new_Deal";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDeal(@ModelAttribute("Deal") Deals Deal) {
        service.save(Deal);

        return "redirect:/";
    }



    @RequestMapping("/delete/{id}")
    public String deleteDeal (@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}