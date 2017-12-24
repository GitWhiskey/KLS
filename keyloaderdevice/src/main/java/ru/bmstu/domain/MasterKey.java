package ru.bmstu.domain;

import org.springframework.stereotype.Component;

/**
 * Created by MKhabrat on 22.12.2017.
 */
@Component
public class MasterKey {

    private String part1;
    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String getFullKey() {
        return part1 + part2;
    }
}
