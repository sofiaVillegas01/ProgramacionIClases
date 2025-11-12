package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SegurcolPTest {
@Test
    public void turnoNocturno(){
    Empleado empleado=new Vigilante("luis","234565",TipoTurno.Dia,32.99,2,TipArma.LETAL);
    TipoTurno tipoTurno=empleado.getTipoTurno();
    Assertions.assertEquals(TipoTurno.Dia,tipoTurno,"el turno debe ser de dia");
    System.out.println(assertEquals());
}
    private boolean assertEquals() {
        return false;
    }


}