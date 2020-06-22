package com.win.subscriberlist.suscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// Designates this class as a Controller
@Controller
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    // Tells the app what template to return at a specific URL
    @GetMapping
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }

    private Subscriber subscriber;

    // Takes te data entered in the form and adds it to the database
    // POSTs the data then displays a new template called "result"
    @PostMapping
    public String addNewSubscriber(Subscriber sunscriber, Model model) {
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
                subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/result";

    }

}