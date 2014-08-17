package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.Train;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:56
 */
public class TrainParserTest {

  private static final String[] EXAMPLE_TRAINS = {
          "BSNC414731405181412070000001 POO2E62    125482001 DMUA   075      S            P       ",
          "BX         GWYGW551800        ",
          "LOEXMOUTH 2359 2359          TB        ",
          "LILYMPSTN 0002H0003      00030003         T        ",
          "LILYMPSTC 0005 0005H     00040004         R        ",
          "LIEXTON   0006H0007      00060006         R        ",
          "LITOPSHAM 0010H0011H     00110011         T        ",
          "LIDIGBY   0015 0015H     00150015         T        ",
          "LIPOLSBDG 0018H0019      00190019         T        ",
          "LIEXMOTHJ           0020 00000000        ",
          "LISTJAMSP 0021 0021H     002100211        T        ",
          "LIEXETERC 0023H0025H     002400252        T        ",
          "LTEXETRSD 0028 00283     TF        ",
          "BSNC414791405181412070000001 POO2E688723125474001 DMUS   075      S S          P       ",
          "BX         GWYGW872300        ",
          "LOPENZNCE 1342 13413         TB        ",
          "LILNGROCK           1345H00000000        ",
          "LISTERTH  1350 1351H     135013512        T        ",
          "LIHAYLE   1354 1354H     135413542        T        ",
          "LICBORNE  1403 1404      14031404         T        ",
          "LIREDRUTH 1409 1410      14091410         T        ",
          "LITRURO   1420 1421      142014213        T        ",
          "LIPROBUS            1427H00000000        ",
          "LIBGLWJN            1435 00000000        ",
          "LISTAUSTL 1437 1438      14371438         T           1        ",
          "LIPARR    1444H1445H     144514452        T        ",
          "LILSTWTHL 1451H1452      145214521        T        ",
          "LIBODMNPW 1457 1458      14571458         T        ",
          "LILRGN              1503H00000000        ",
          "LISTPNCVE           1504H00000000        ",
          "LILISKARD 1510 1511      151015112        T        ",
          "LISTGRMNS 1521 1521H     152115212        T           1        ",
          "LISASH    1528H1529H     152915292        T        ",
          "LISTBDXJN           1533 00000000         X           1        ",
          "CRPLYMTH  OO2E688723125462001 DMUS   075      S S                  GW872300     ",
          "LIPLYMTH  1538H1549      153815498        T        ",
          "LILIPSONJ           1552 00000000                       3        ",
          "LIHEMERDN           1601 00000000        ",
          "LIIVYBDGE 1606H1607H     160716072        T        ",
          "LIAISHXO            1612 00000000        ",
          "LITOTNES  1620H1621H     162116212        T        ",
          "LIDAINTNT           1628 00000000        ",
          "LINABTWJ            1632 00000000        ",
          "LINABT    1633 1634      163316343        T        ",
          "LITEINMTH           1640 00000000        ",
          "LIDAWLISH           1643 00000000        ",
          "LIDAWLSHW           1644H00000000                     1        ",
          "LTEXETRSD 1655 16556     TF        "
  };

  private TrainParser trainParser;
  private MockParseListener<Train> mockParseListener;

  @Before
  public void setUp() {
    trainParser = new TrainParser();
    mockParseListener = new MockParseListener<Train>();
    trainParser.addListener(mockParseListener);
  }

  @Test
  public void parsesTwoTrainsCorrectlyTest() {
    trainParser.parse(Arrays.asList(EXAMPLE_TRAINS).iterator());
    assertEquals("Trains parsed", 2, mockParseListener.parsed.size());
  }

}
