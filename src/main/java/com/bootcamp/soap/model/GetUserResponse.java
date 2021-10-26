package com.bootcamp.soap.model;

import com.bootcamp.soap.model.User;
import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "user"
})
@XmlRootElement(name = "getUserResponse")
public class GetUserResponse {

    @XmlElement(required = true)
    protected User user;
}