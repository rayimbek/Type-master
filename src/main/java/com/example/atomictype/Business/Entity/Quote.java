package com.example.atomictype.Business.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Base64;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Quote {
    @Id
    private Long id;
    private String title;
    @Column(columnDefinition = "text")
    private String content;
    private String author;
    //Link to image hosting
    private String cover;

}
