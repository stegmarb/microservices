package com.stegmarb.feignserver.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fragrance {

    private String name;
    private String brand;
    private int releaseYear;
    private List<String> headNotes;
    private List<String> middleNotes;
    private List<String> baseNotes;
    private boolean hasBeenReformulated;
}
