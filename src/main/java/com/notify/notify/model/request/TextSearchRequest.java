package com.notify.notify.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TextSearchRequest {
    @JsonProperty("text")
    private String text;

}
