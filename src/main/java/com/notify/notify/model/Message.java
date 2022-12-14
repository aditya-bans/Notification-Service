package com.notify.notify.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @JsonProperty("id")
    private String id;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("message")
    private String message;
    @JsonProperty("time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime time;

    public Message(String id, String phoneNumber, String message) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.message = message;
        time = LocalDateTime.now();
    }
}
