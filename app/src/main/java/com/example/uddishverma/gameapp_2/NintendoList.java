package com.example.uddishverma.gameapp_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NintendoList extends AppCompatActivity {

    ArrayList<NintendoClass.nintendoDetails> listViewDetails;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo_list);

        listViewDetails = NintendoClass.getDetails();
        listView = (ListView) findViewById(R.id.nintendo_list);

        DetailsListAdapter detailsListAdapter = new DetailsListAdapter(listViewDetails);
        listView.setAdapter(detailsListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    //semding cheats link for halo 5
                    b.putString("cheats", "http://www.ign.com/cheats/games/halo-5-xbox-one-20000557");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=RKbStE0Cz8Y");
                    b.putString("amazon", "http://www.amazon.in/Halo-5-Guardians-Xbox-One/dp/B0108FFVYG/ref=sr_1_1?ie=UTF8&qid=1467805008&sr=8-1&keywords=halo+5");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 1)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", " http://www.ign.com/cheats/games/forza-horizon-2-xbox-360-20019291");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=AX7r61fyltc");
                    b.putString("amazon", "http://www.amazon.in/Forza-Horizon-2-Xbox-One/dp/B00M7TIM20/ref=sr_1_1?ie=UTF8&qid=1467828062&sr=8-1&keywords=forza+horizon+2");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 2)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/wikis/sunset-overdrive/Cheats_and_Secrets");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=S_fcsWnbmGE");
                    b.putString("amazon", "http://www.amazon.in/Microsoft-3QT-00001-Sunset-Overdrive-Xbox/dp/B00DB84XQK/ref=sr_1_1?ie=UTF8&qid=1467828098&sr=8-1&keywords=sunset+overdrive");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 3)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/cheats/games/gears-of-war-ultimate-edition-xbox-one-20026389");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=9V-aBdWY2us");
                    b.putString("amazon", "http://www.amazon.in/Gears-War-Ultimate-Microsoft/dp/B00ZMBLKPG/ref=sr_1_1?ie=UTF8&qid=1467828121&sr=8-1&keywords=gears+of+war+4");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 4)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", " https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&cad=rja&uact=8&ved=0ahUKEwjjpuXCs9_NAhXFto8KHaUXDUIQFggrMAM&url=http%3A%2F%2Fwww.ign.com%2Fcheats%2Fgames%2Fquantum-break-xbox-one-169587&usg=AFQjCNECZ2PaA0V_a7W0CKkYuDD-GLk6SQ");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=e_dhFM8zLNk");
                    b.putString("amazon", "http://www.amazon.in/Microsoft-Quantum-Break-Xbox-One/dp/B01C2PGMV6/ref=sr_1_1?ie=UTF8&qid=1467828164&sr=8-1&keywords=quantum+break");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 5)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/cheats/games/state-of-decay-xbox-360-99557");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=B0Q1l07NeKU");
                    b.putString("amazon", "http://www.amazon.in/State-of-Decay-Xbox-One/dp/B00KW6ALUQ/ref=sr_1_1?ie=UTF8&qid=1467828187&sr=8-1&keywords=state+of+decay");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 6)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/cheats/games/state-of-decay-xbox-360-99557");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=B0Q1l07NeKU");
                    b.putString("amazon", "http://www.amazon.in/State-of-Decay-Xbox-One/dp/B00KW6ALUQ/ref=sr_1_1?ie=UTF8&qid=1467828187&sr=8-1&keywords=state+of+decay");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 7)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/wikis/sunset-overdrive/Cheats_and_Secrets");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=S_fcsWnbmGE");
                    b.putString("amazon", "http://www.amazon.in/Microsoft-3QT-00001-Sunset-Overdrive-Xbox/dp/B00DB84XQK/ref=sr_1_1?ie=UTF8&qid=1467828098&sr=8-1&keywords=sunset+overdrive");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 8)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/cheats/games/gears-of-war-ultimate-edition-xbox-one-20026389");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=9V-aBdWY2us");
                    b.putString("amazon", "http://www.amazon.in/Gears-War-Ultimate-Microsoft/dp/B00ZMBLKPG/ref=sr_1_1?ie=UTF8&qid=1467828121&sr=8-1&keywords=gears+of+war+4");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 9)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", " https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&cad=rja&uact=8&ved=0ahUKEwjjpuXCs9_NAhXFto8KHaUXDUIQFggrMAM&url=http%3A%2F%2Fwww.ign.com%2Fcheats%2Fgames%2Fquantum-break-xbox-one-169587&usg=AFQjCNECZ2PaA0V_a7W0CKkYuDD-GLk6SQ");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=e_dhFM8zLNk");
                    b.putString("amazon", "http://www.amazon.in/Microsoft-Quantum-Break-Xbox-One/dp/B01C2PGMV6/ref=sr_1_1?ie=UTF8&qid=1467828164&sr=8-1&keywords=quantum+break");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 10)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/cheats/games/state-of-decay-xbox-360-99557");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=B0Q1l07NeKU");
                    b.putString("amazon", "http://www.amazon.in/State-of-Decay-Xbox-One/dp/B00KW6ALUQ/ref=sr_1_1?ie=UTF8&qid=1467828187&sr=8-1&keywords=state+of+decay");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
                if(position == 11)   {
                    Intent i = new Intent(NintendoList.this ,Halo5_page.class);
                    Bundle b = new Bundle();
                    b.putString("cheats", "http://www.ign.com/cheats/games/state-of-decay-xbox-360-99557");
                    b.putString("gameplay", "https://www.youtube.com/watch?v=B0Q1l07NeKU");
                    b.putString("amazon", "http://www.amazon.in/State-of-Decay-Xbox-One/dp/B00KW6ALUQ/ref=sr_1_1?ie=UTF8&qid=1467828187&sr=8-1&keywords=state+of+decay");
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            }
        });
    }

    private class DetailsListAdapter extends BaseAdapter{

        class DetailsViewHolder  {
            TextView gameName;
            ImageView gamePicture;
        }

        public DetailsListAdapter(ArrayList<NintendoClass.nintendoDetails> mDetails) {
            this.mDetails = mDetails;
        }

        ArrayList<NintendoClass.nintendoDetails> mDetails;

        @Override
        public int getCount() {
            return mDetails.size();
        }

        @Override
        public Object getItem(int position) {
            return mDetails.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            DetailsViewHolder detailsViewHolder;
            detailsViewHolder = new DetailsViewHolder();
            if(convertView == null) {
                convertView = li.inflate(R.layout.nintendo_layout,null);
                detailsViewHolder.gameName = (TextView) convertView.findViewById(R.id.nintendo_text);
                detailsViewHolder.gamePicture = (ImageView) convertView.findViewById(R.id.nintendo_image);
                convertView.setTag(detailsViewHolder);
            }
            else    {
                detailsViewHolder = (DetailsViewHolder) convertView.getTag();
            }

            NintendoClass.nintendoDetails thisDetails = (NintendoClass.nintendoDetails) getItem(position);
            detailsViewHolder.gameName.setText(thisDetails.name);
            detailsViewHolder.gamePicture.setImageResource(thisDetails.picture);
            return convertView;
        }
    }
}
