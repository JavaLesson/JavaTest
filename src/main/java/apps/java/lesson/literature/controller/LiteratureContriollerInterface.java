package apps.java.lesson.literature.controller;

import apps.java.lesson.literature.entity.client.LiteratureArray;

/**
 * Created by ${Alexey} on ${09.08.2016}.
 */
interface LiteratureControllerInterface {
    LiteratureArray getQuestion(int questionId);
}
