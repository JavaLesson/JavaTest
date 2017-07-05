package apps.java.lesson.question.repository.MySQL;

import apps.java.lesson.question.entity.topic.hibernate.TopicDB;
import apps.java.lesson.question.repository.TopicRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MySQLTopicRepository {
    private TopicRepositoryInterface topicRepository;

    @Autowired
    MySQLTopicRepository(TopicRepositoryInterface topicRepository){
        this.topicRepository = topicRepository;
    }

    public List<TopicDB> getTopics(){
        List<TopicDB> topics = new ArrayList<TopicDB>();
        for (TopicDB topicDb: topicRepository.findAll()) {
            topics.add(topicDb);
        }
        return topics;
    }
}
