package com.myinstagram.web;

import com.myinstagram.model.Vote;
import com.myinstagram.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RootController {

    @Autowired
    private VoteRepository voteRepository;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String getIndex(Model model) {
        Vote vote = voteRepository.findOne(1L);
        model.addAttribute("vote", vote);
        return "index";
    }
}
