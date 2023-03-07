package fr.wcs.doctor.controller;

import fr.wcs.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {
    /*quête n° 2 */
    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor getDoctor(@PathVariable int number) {
        if (number == 13) {
            Doctor doctor = new Doctor(13, "Doc Frankenstein");
            return doctor;
        } else if ((number >= 1 && number <= 12) ) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Voir autre chose :/");
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation: " + number);
        }
    }

    /*quête n° 1 */
/*    @GetMapping("/doctor/1")
    @ResponseBody
    public String getDoctor1() {
        return "Doc la Peluche";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String getDoctor10() {
        return "Doc Jekyll";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String getDoctor13() {
        return "Doc Frankenstein";
    }*/

}
