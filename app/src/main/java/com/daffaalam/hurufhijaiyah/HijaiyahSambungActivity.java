package com.daffaalam.hurufhijaiyah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HijaiyahSambungActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemSamData> itemSamData = new ArrayList<>();
    ItemSamAdapter itemSamAdapter;

    String hijaiyah_[] = {
            "ا",
            "ب",
            "ت",
            "ث",
            "ج",
            "ح",
            "خ",
            "د",
            "ذ",
            "ر",
            "ز",
            "س",
            "ش",
            "ص",
            "ض",
            "ط",
            "ظ",
            "ع",
            "غ",
            "ف",
            "ق",
            "ك",
            "ل",
            "م",
            "ن",
            "و",
            "ه",
            "لا",
            "ء",
            "ي"
    };

    String awal[] = {
            " ",
            "بـ",
            "تـ",
            "ثـ",
            "جـ",
            "حـ",
            "خـ",
            " ",
            " ",
            " ",
            " ",
            "سـ",
            "شـ",
            "صـ",
            "ضـ",
            "طـ",
            "ظـ",
            "عـ",
            "غـ",
            "فـ",
            "قـ",
            "كـ",
            "لـ",
            "مـ",
            "نـ",
            " ",
            "هـ",
            " ",
            " ",
            "يـ"
    };

    String tengah[] = {
            " ",
            "ـبـ",
            "ـتـ",
            "ـثـ",
            "ـجـ",
            "ـحـ",
            "ـخـ",
            " ",
            " ",
            " ",
            " ",
            "ـسـ",
            "ـشـ",
            "ـصـ",
            "ـضـ",
            "ـطـ",
            "ـظـ",
            "ـعـ",
            "ـغـ",
            "ـفـ",
            "ـقـ",
            "ـكـ",
            "ـلـ",
            "ـمـ",
            "ـنـ",
            " ",
            "ـهـ",
            " ",
            " ",
            "ـيـ"
    };

    String akhir[] = {
            "ـا",
            "ـب",
            "ـت",
            "ـث",
            "ـج",
            "ـح",
            "ـخ",
            "ـد",
            "ـذ",
            "ـر",
            "ـز",
            "ـس",
            "ـش",
            "ـص",
            "ـض",
            "ـط",
            "ـظ",
            "ـع",
            "ـغ",
            "ـف",
            "ـق",
            "ـك",
            "ـل",
            "ـم",
            "ـن",
            "ـو",
            "ـه",
            "ـلا",
            " ",
            "ـي"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_sambung);
        setTitle("Huruf Hijaiyah Bersambung");

        layoutManager = new LinearLayoutManager(this);
        itemSamAdapter = new ItemSamAdapter(this, itemSamData);
        for (int urutan = 0; urutan < hijaiyah_.length; ++urutan) {
            itemSamData.add(new ItemSamData(hijaiyah_[urutan], awal[urutan], tengah[urutan], akhir[urutan]));
        }
        recyclerView = findViewById(R.id.review_sam);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemSamAdapter);
    }
}
