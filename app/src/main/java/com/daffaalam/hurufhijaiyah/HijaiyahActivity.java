package com.daffaalam.hurufhijaiyah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HijaiyahActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemData> itemData = new ArrayList<>();
    ItemAdapter itemAdapter;

    String huruf_hijaiyah[] = {
            "1. Alif (A, I, U)",
            "2. Bâ (B)",
            "3. Tâ (T)",
            "4. Tsâ (TS)",
            "5. Jîm (J)",
            "6. Hâ (H)",
            "7. Khô (KH)",
            "8. Dâl (D)",
            "9. Dzâl (DZ)",
            "10. Rô (R)",
            "11. Zâ (Z)",
            "12. Sîn (S)",
            "13. Syîn (SY)",
            "14. Shôd (SH)",
            "15. Dhôd (DH)",
            "16. Thô (TH)",
            "17. Zhô (ZH)",
            "18. `Aîn (`A, `I, `U)",
            "19. Ghoîn (GH)",
            "20. Fâ (F)",
            "21. Qôf (Q)",
            "22. Kâf (K)",
            "23. Lâm (L)",
            "24. Mîm (M)",
            "25. Nûn (N)",
            "26. Wâw (W)",
            "27. Hâ (H)",
            "*. Lâm Alif",
            "28. Hamzah (‘)",
            "29. Yâ (Y)",
            "(*) Jika dipecah menjadi perhuruf, huruf Lâm Alif bisa menjadi huruf LAM dan ALIF."
    };

    Integer gambar_hijaiyah[] = {
            R.drawable.alif,
            R.drawable.ba,
            R.drawable.ta,
            R.drawable.tsa,
            R.drawable.jim,
            R.drawable.ha,
            R.drawable.kho,
            R.drawable.dal,
            R.drawable.dzal,
            R.drawable.ro,
            R.drawable.za,
            R.drawable.sin,
            R.drawable.syin,
            R.drawable.shod,
            R.drawable.dhod,
            R.drawable.tho,
            R.drawable.zho,
            R.drawable.ain,
            R.drawable.ghoin,
            R.drawable.fa,
            R.drawable.qof,
            R.drawable.kaf,
            R.drawable.lam,
            R.drawable.mim,
            R.drawable.nun,
            R.drawable.waw,
            R.drawable.haa,
            R.drawable.lamalif,
            R.drawable.hamzah,
            R.drawable.ya,
            0
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);
        setTitle("29 Huruf Hijaiyah");

        recyclerView = findViewById(R.id.review);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        for (int urutan = 0; urutan < huruf_hijaiyah.length; ++urutan) {
            itemData.add(new ItemData(gambar_hijaiyah[urutan], huruf_hijaiyah[urutan]));
        }

        itemAdapter = new ItemAdapter(this, itemData);
        recyclerView.setAdapter(itemAdapter);

    }
}
