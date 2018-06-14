package rocks.gebsattel.joke.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import rocks.gebsattel.joke.services.JokeService

@Controller
class JokeController {

    private JokeService jokeService

    @Autowired
    JokeController(JokeService jokeService) {
        this.jokeService = jokeService
    }

    @RequestMapping(["/", ""])
    String showJoke(Model model){

        /** append the model with a property for the joke
         *  Spring framework will pass in an instance for the model
         */
        model.addAttribute("joke", jokeService.getJoke())

        /** return the view-name
         *  to tell the thymeleaf-engine which template to use
         */
        return "chucknorris"

    }
}
