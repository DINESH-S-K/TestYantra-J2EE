package com.tyss.springtesting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
  private int id;
  private String name;
  private Battery battery;
}
