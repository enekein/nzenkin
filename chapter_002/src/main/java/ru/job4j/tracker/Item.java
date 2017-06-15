package ru.job4j.tracker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 06.06.2017.
 */
public class Item {
    /**
     * Id of item String.
     */
    private String id;
    /**
     * Name of item String.
     */
    private String name;
    /**
     * Desc of item String.
     */
    private String desc;
    /**
     * Creation date of item long.
     */
    private long created;
    /**
     * Comments of item String[].
     */
    private String[] comments = new String[10];
    /**
     * Comments number of item int.
     */
    private int positionComment = 0;
    /**
     * Variable for Random in generateId().
     */
    private static final Random RN = new Random();
    /**
     * Line separator for output.
     */
    private String lineSeparator = System.lineSeparator();

    /**
     * Constructor.
     * @param name String.
     * @param desc String.
     * @param comment String.
     */
    Item(String name, String desc, String comment) {
        this.name = name;
        this.desc = desc;
        this.created = getDate();
        this.id = generateId();
        addComment(comment);
    }

    /**
     * Add comment.
     * @param comment String.
     */
    public void addComment(String comment) {
        this.comments[positionComment++] = comment;
    }

    /**
     * Get id.
     * @return String.
     */
    String getId() {
        return this.id;
    }

    /**
     * Get name.
     * @return String.
     */
    String getName() {
        return this.name;
    }

    /**
     * Get description.
     * @return String.
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * Get created date.
     * @return long.
     */
    public long getCreated() {
        return this.created;
    }

    /**
     * Get comments.
     * @return String[].
     */
    public String[] getComments() {
        return this.comments;
    }

    /**
     * Generate id for new item.
     * @return String.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Get date for new item.
     * @return long.
     */
    private long getDate() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyyMMdd");
        return Long.valueOf(formatForDateNow.format(dateNow));
    }

    /**
     * Override toString() method for item.
     * @return String.
     */
    @Override
    public String toString() {
        return String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                this.getId() + lineSeparator, this.getName() + lineSeparator,
                this.getDesc() + lineSeparator, this.getCreated(), lineSeparator);
    }

    /**
     * Needed for JUnit, update test.
     * @param id String.
     */
    public void setId(String id) {
        this.id = id;
    }
}
