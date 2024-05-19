package gabri.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
public class DNATest {

    @Test
    public void isMutant(){
        String[]dna1={"ATGCGA","CAGTGA","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        DNA dna=new DNA();
        assertTrue(dna.isMutant(dna1));
    }
    @Test
    public void notIsMutant(){
        String[]dna1={"CTGCGA","CAGTGA","TTATAT","AGAAGG","CCCCTA","TCACTG"};
        DNA dna=new DNA();
        assertFalse(dna.isMutant(dna1));
    }



}