package lk.himash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {

    private int id;
    private String name;
    private String province;
    private int population;



}
