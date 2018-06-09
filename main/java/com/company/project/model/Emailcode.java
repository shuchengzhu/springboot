package com.company.project.model;

import javax.persistence.*;

public class Emailcode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String emailcode;

    private String useremail;

    private String password;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return emailcode
     */
    public String getEmailcode() {
        return emailcode;
    }

    /**
     * @param emailcode
     */
    public void setEmailcode(String emailcode) {
        this.emailcode = emailcode;
    }

    /**
     * @return useremail
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * @param useremail
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
