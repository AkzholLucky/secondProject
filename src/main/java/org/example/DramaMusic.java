package org.example;

import org.springframework.stereotype.Component;

@Component
public class DramaMusic implements Music{
    @Override
    public String getSong() {
        return "Drama music";
    }
}
