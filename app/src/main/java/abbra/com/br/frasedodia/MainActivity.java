package abbra.com.br.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private TextView tituloNovaFrase;


    private String[] titulos ={
       "Ave Maria",  "Santo Anjo", "Pai Nosso", "Credo", "Salve Rainha", "Gloria ao pai", "Cordeiro de Deus", "Glória a Deus nas Alturas", "Vinde Espírito Santo"
    };
    private String[] frases = {
            "Ave Maria, cheia de graça, o Senhor é convosco, bendita sois vós entre as mulheres e bendito é o fruto do vosso ventre, Jesus. Santa Maria, Mãe de Deus, rogai por nós pecadores, agora e na hora da nossa morte. Amém",
            "Santo Anjo do Senhor, meu zeloso guardador, já que a ti me confiou a Piedade Divina, sempre me rege, guarda, governa e ilumina. Amém.\n",
            "Pai Nosso que estais nos Céus, santificado seja o vosso Nome, venha a nós o vosso Reino, seja feita a vossa vontade assim na terra como no Céu. O pão nosso de cada dia nos dai hoje, perdoai-nos as nossas ofensas assim como nós perdoamos a quem nos tem ofendido, e não nos deixeis cair em tentação, mas livrai-nos do Mal. Amém",
            "Creio em Deus Pai todo-poderoso, criador do céu e da terra; e em Jesus Cristo, seu único Filho, Nosso Senhor; que foi concebido pelo poder do Espírito Santo; nasceu na Virgem Maria, padeceu sob Pôncio Pilatos, foi crucificado morto e sepultado; desceu à mansão dos mortos; ressuscitou ao terceiro dia; subiu aos céus, está sentado à direita de Deus Pai" +
                    " todo-poderoso, donde há de vir a julgar os vivos e os mortos; creio no Espírito Santo, na santa Igreja Católica, na comunhão dos santos, na remissão dos pecados, na ressurreição da carne, na vida eterna. Amém",
            "Salve, Rainha, Mãe de misericórdia, vida, doçura e esperança nossa, salve! A vós bradamos, os degredados filhos de Eva; a vós suspiramos, gemendo e chorando neste vale de lágrimas. Eia, pois advogada nossa, esses vossos olhos misericordiosos a nós volvei; e depois deste desterro nos mostrai Jesus, bendito fruto do vosso ventre, ó clemente, ó piedosa, ó doce sempre Virgem Maria.\n" +
                    "\n" +
                    "Rogai por nós, santa Mãe de Deus.\n" +
                    "R: Para que sejamos dignos das promessas de Cristo.",
            "Glória ao Pai e ao Filho e ao Espírito Santo. Como era, no princípio, agora e sempre. Amém",
            "Cordeiro de Deus, que tirais o pecado do mundo, tende piedade de nós.\n" +
                    "Cordeiro de Deus, que tirais o pecado do mundo, tende piedade de nós.\n" +
                    "Cordeiro de Deus, que tirais o pecado do mundo, dai-nos a paz.",
            "Glória a Deus nas alturas e paz na terra aos homens por Ele amados. Senhor Deus, Rei dos céus, Deus Pai todo-poderoso: nós. Vos louvamos, nós Vos bendizemos, nós Vos adoramos, nós Vos glorificamos,"+" nós Vos damos graças, por vossa imensa glória. Senhor Jesus Cristo, Filho Unigénito, Senhor Deus, Cordeiro de Deus, Filho de Deus Pai: Vós que tirais o pecado do mundo, tende piedade de nós; Vós que tirais o pecado do mundo, acolhei a nossa súplica;" +
                    " Vós que estais à direita do Pai, tende piedade de nós. Só Vós sois o Santo; só Vós, o Senhor; só Vós, o Altíssimo, Jesus Cristo; com o Espírito Santo na glória de Deus Pai. Amém",
             "Vinde Espírito Santo, enchei os corações dos vossos fiéis e acendei neles o fogo do Vosso Amor. Enviai o Vosso Espírito e tudo será criado e renovareis a face da terra.\n" +
                     "Oremos: Ó Deus que instruíste os corações dos vossos fiéis, com a luz do Espírito Santo, fazei que apreciemos retamente todas as coisas segundo o mesmo Espírito e gozemos da sua consolação.Por Cristo Senhor Nosso. Amém"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);
        tituloNovaFrase = (TextView) findViewById(R.id.tituloId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                tituloNovaFrase.setText(titulos[numeroAleatorio]);
                textoNovaFrase.setText(frases[numeroAleatorio]);

            }
        });

    }
}
