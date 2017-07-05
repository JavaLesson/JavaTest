package apps.java.lesson.question.entity.topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public class TopicsArray {
    private List<Topic> topics = new ArrayList<Topic>();

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}
