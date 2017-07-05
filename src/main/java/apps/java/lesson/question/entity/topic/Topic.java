package apps.java.lesson.question.entity.topic;


import apps.java.lesson.question.entity.topic.hibernate.TopicDB;

public class Topic {
    private int topicId;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopic(TopicDB topicDB){
        topicId = topicDB.getTopicId();
        title = topicDB.getTopic();
    }
}
