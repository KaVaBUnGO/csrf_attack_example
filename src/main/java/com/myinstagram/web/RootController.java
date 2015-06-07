package com.myinstagram.web;

import com.myinstagram.model.Vote;
import com.myinstagram.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RootController {

    @Autowired
    private VoteRepository voteRepository;

    @RequestMapping(value = {"/", "/cats"}, method = RequestMethod.GET)
    public String getIndex(Model model) {
        Vote vote = voteRepository.findOne(1L);
        model.addAttribute("vote", vote);
        return "index";
    }

    @RequestMapping(value = {"/", "/cats"}, method = RequestMethod.POST, params = {"addVote"})
    public String getVote(@RequestParam("addVote") int incVote, Model model) {
        Vote vote = voteRepository.findOne(1L);
        vote.setValue(vote.getValue()+incVote);
        voteRepository.save(vote);
        model.addAttribute("vote", vote);
        return "index";
    }
}
