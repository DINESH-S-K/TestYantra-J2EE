package com.tyss.classwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BookStall {
   @Value(value = "Dinesh")
   String name;
   @Autowired
   @Qualifier
   Pen pen;
}
