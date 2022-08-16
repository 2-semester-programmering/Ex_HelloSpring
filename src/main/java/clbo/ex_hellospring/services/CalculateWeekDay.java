package clbo.ex_hellospring.services;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CalculateWeekDay {

    public String erDetFredag(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("u");
        if (formatter.format(date).equals("5")){
            return "YES!";
        }
        return "NO!";

    }
}
