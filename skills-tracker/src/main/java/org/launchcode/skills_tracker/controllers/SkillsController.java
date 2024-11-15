package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @ResponseBody
    @GetMapping
    public String index() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!";

    }

    @ResponseBody
    @GetMapping("skills")
    public String skillsForm() {
        String html =
                "<html>" +
                        "<body>" +
                "<form method='post'>" +
                        "<h2>Name:</h2>" +
                "<input type='text' name='name' />" +
                        "<h2>My favorite language</h2>" +
                "<select name='language'>" +
                "<option value=''>Please Choose A Language:</option>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                        "<h2>My second favorite language</h2>" +
                        "<select name='language'>" +
                        "<option value=''>Please Choose A Language:</option>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javascript'>Javascript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>" +
                        "<h2>My third favorite language</h2>" +
                        "<select name='language'>" +
                        "<option value=''>Please Choose A Language:</option>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javascript'>Javascript</option>" +
                        "<option value='python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<button type='submit'>Submit</button>" +
                        "</form>" +
                        "</body>" +
                "</html>";
        return html;


                //<html> +
                    //<body> +
                        //"<form method = 'get' action = ''>"+
                            //"<input type = 'text" name = ''/>
                            //"<input type = 'submit' value = ''' />"
                        // </form>
                    // </body>
                // </html>
    }

    @ResponseBody
    @PostMapping("skills")
    public String handleSkills(@RequestParam String name, @RequestParam String language) {
        return name + language;

    }
}
