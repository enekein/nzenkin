package ru.job4j.tracker;

import java.util.Random;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 06.06.2017.
 */
public class Item {
    private String id;
    private String name;
    private String desc;
    private long created;
    private String[] comments;
    private int positionComment = 0;
    private static final Random RN = new Random();

    /**
     * Constructor.
     * @param name String.
     * @param desc String.
     * @param created long.
     */
    Item(String name, String desc, long created) {
        setName(name);
        setDesc(desc);
        setCreated(created);
        setId(generateId());
    }

    /**
     * Set id.
     * @param id String.
     */
    void setId(String id) { this.id = id; }

    /**
     * Set name.
     * @param name String.
     */
    private void setName(String name) { this.name = name; }

    /**
     * Set description.
     * @param desc String.
     */
    private void setDesc(String desc) { this.desc = desc; }

    /**
     * Set created.
     * @param created long.
     */
    private void setCreated(long created) { this.created = created; }

    /**
     * Add new comment to item.
     * @param comment String.
     */
    public void addComments(String comment) { this.comments[positionComment++] = comment; }

    /**
     * Get id.
     * @return String.
     */
    String getId() { return this.id; }

    /**
     * Get name.
     * @return String.
     */
    String getName() { return this.name; }

    /**
     * Get description.
     * @return String.
     */
    public String getDesc() { return this.desc; }

    /**
     * Get created date.
     * @return long.
     */
    public long getCreated() { return this.created; }

    /**
     * Get comments.
     * @return String[].
     */
    public String[] getComments() { return this.comments;}

    /**
     * Generate id for new item.
     * @return String.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
