package apps.java.lesson.question.controller;

import apps.java.lesson.question.entity.client.answers.UserAnswersArray;
import apps.java.lesson.question.entity.question.Question;
import apps.java.lesson.question.entity.topic.TopicsArray;
import apps.java.lesson.question.facade.QuestionFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class QuestionController {

    private QuestionFacade questionFacade;

    @Autowired
    QuestionController(QuestionFacade questionFacade){
        this.questionFacade = questionFacade;
    }

    @RequestMapping(path = "/topics", method = RequestMethod.GET)
    public TopicsArray getQuestion (){
        return null;
    }

    @RequestMapping(path = "/questions/{topicId}", method = RequestMethod.GET)
    public Question getQuestion (@PathVariable("topicId") int topicId){
        return null;
    }

    @RequestMapping(path = "/check/answers", method = RequestMethod.POST)
    public UserAnswersArray check(@RequestBody UserAnswersArray answers){
        return null;
    }

}
