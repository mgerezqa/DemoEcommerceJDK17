import domain.Celular;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

class CelularTest {

    private Celular xiaomi;
    private Celular samsung;

    private List<Celular> celulares;

    @BeforeEach
    public void setUp() {
         xiaomi = new Celular("Xiaomi", "Redmi Note", "negro","1234");
         samsung = new Celular("Samsung", "SE7", "plateado","3234");
         celulares = new ArrayList<>();
         celulares.add(samsung);
         celulares.add(xiaomi);
    }

    @DisplayName("Dado dos celulares distintos entonce son de marcas diferentes")
    @Test
    void ValidarQueDosTelefonosDeMarcasDiferentesSonDiferentes(){
        Assertions.assertNotEquals(xiaomi.getMarca(),samsung.getMarca());
    }

    @DisplayName("Dado un celular el mismo tiene que tener un nro imei")
    @Test
    void validarMarcaDeCelular(){
        Assertions.assertNotNull(xiaomi.getImei());
    }

    @DisplayName("Todos los celulares tienen diferente color")
    @Test
    void validarColoresIdenticos(){
        long count = celulares.stream()
                .map(Celular::getColor)
                .distinct()
                .count();
        System.out.println("El conteo dio:"+count);
        Assertions.assertNotEquals(1, count);
    }
}