package apps.java.lesson.question.controller;

import apps.java.lesson.question.entity.client.answers.UserAnswersArray;
import apps.java.lesson.question.entity.question.QuestionsArray;
import apps.java.lesson.question.entity.topic.TopicsArray;
import apps.java.lesson.question.facade.QuestionFacadeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class QuestionController implements QuestionControllerInterface{

    private QuestionFacadeInterface questionFacade;

    @Autowired
    QuestionController(QuestionFacadeInterface questionFacade){
        this.questionFacade = questionFacade;
    }

    @Override
    @RequestMapping(path = "/topics", method = RequestMethod.GET)
    public TopicsArray getQuestion (){
        return questionFacade.getTopics();
    }

    @Override
    @RequestMapping(path = "/questions/{topicId}", method = RequestMethod.GET)
    public QuestionsArray getQuestion (@PathVariable("topicId") int topicId){
        QuestionsArray questionsArray = new QuestionsArray();
        questionsArray.setQuestions(questionFacade.getQuestions(topicId).getQuestions());
        return questionsArray;
    }

    @Override
    @RequestMapping(path = "/check/answers", method = RequestMethod.POST)
    public UserAnswersArray check(@RequestBody UserAnswersArray answers){
        return null;
    }

}
