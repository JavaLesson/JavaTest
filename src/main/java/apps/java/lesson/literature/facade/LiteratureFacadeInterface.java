package apps.java.lesson.literature.facade;

import apps.java.lesson.literature.entity.client.LiteratureArray;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
public interface LiteratureFacadeInterface {
    LiteratureArray getLiterature(int questionId);
}
