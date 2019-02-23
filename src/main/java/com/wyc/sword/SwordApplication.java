package com.wyc.sword;

import com.wyc.sword.fourteen.MaxProductAfterCutting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwordApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwordApplication.class, args);
        MaxProductAfterCutting maxProductAfterCutting = new MaxProductAfterCutting();
        System.out.println(maxProductAfterCutting.maxProductAfterCutting_solution2(5));
    }

}

