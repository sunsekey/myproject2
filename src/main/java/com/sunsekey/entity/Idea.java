package com.sunsekey.entity;

/**
 * Created by Administrator on 2016/8/3.
 */
public class Idea {
    private Integer id;
    private String content;
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idea idea = (Idea) o;

        if (id != null ? !id.equals(idea.id) : idea.id != null) return false;
        if (content != null ? !content.equals(idea.content) : idea.content != null) return false;
        if (person != null ? !person.equals(idea.person) : idea.person != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        return result;
    }
}
