package ru.bmstu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.bmstu.domain.MasterKey;

/**
 * Created by MKhabrat on 22.12.2017.
 */
@RestController
@RequestMapping("/master-key")
public class MasterKeySubmittionController {

    @Autowired
    private MasterKey masterKey;

    @RequestMapping(value = "/part1", method = RequestMethod.POST)
    public void submitPart1(@RequestBody String part1) {
        masterKey.setPart1(part1);
    }

    @RequestMapping(value = "/part2", method = RequestMethod.POST)
    public void submitPart2(@RequestBody String part2) {
        masterKey.setPart2(part2);
    }

}
