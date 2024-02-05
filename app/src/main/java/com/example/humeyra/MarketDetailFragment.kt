package com.example.humeyra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView


class MarketDetailFragment :
AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_market_detail)



        val item1CardView = findViewById<CardView>(R.id.item1CardView)
        item1CardView.setOnClickListener {
            Toast.makeText(this,"Activia,Danone şirketine ait bir markadır ve Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturmakla birlikte Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }

        val item2CardView = findViewById<CardView>(R.id.item2CardView)
        item2CardView.setOnClickListener {
            Toast.makeText(this, "Magnum, Cornetto, Cartedor, Max alt markalarıyla Algida dondurmaları,Unilever şirketinin markalarıdır.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()
        }


        val item3CardView = findViewById<CardView>(R.id.item3CardView)
        item3CardView.setOnClickListener {
            Toast.makeText(this,"Alpro,Danone şirketine ait bir markadır ve Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturmakla birlikte Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }

        val item4CardView = findViewById<CardView>(R.id.item4CardView)
        item4CardView.setOnClickListener {
            Toast.makeText(this, "Aptamil,Danone şirketine ait bir markadır ve Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturmakla birlikte Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }


        val item5CardView = findViewById<CardView>(R.id.item5CardView)
        item5CardView.setOnClickListener {
            Toast.makeText(this,"Bebelac,Danone şirketine ait bir markadır ve Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturmakla birlikte Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }

        val item6CardView = findViewById<CardView>(R.id.item6CardView)
        item6CardView.setOnClickListener {
            Toast.makeText(this, "Becel,Unilever'in alt grubu olan Upfield'ın bir markasıdır.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()
        }


        val item7CardView = findViewById<CardView>(R.id.item7CardView)
        item7CardView.setOnClickListener {
            Toast.makeText(this,"Burger King, 3G Capital tarafından devralınmıştır ve Restaurant Brand International (RBI) çatısı altında faaliyet göstermektedir.BurgerKing, Gazze soykırımının başlamasıyla, Ekim 2023’te İsrail Savunma Kuvvetleri'ne (IDF) “kahramanlarımızı destekliyoruz” diyerek ücretsiz yemek dağıttı. Ayrıca,Instagram’daki profil renklerini İsrail bayrağının renkleri olan mavi ve beyaza dönüştürerek İsrail işgalini desteklediğini açıkça göstermiştir.",Toast.LENGTH_LONG).show()
        }

        val item8CardView = findViewById<CardView>(R.id.item8CardView)
        item8CardView.setOnClickListener {
            Toast.makeText(this, "Calve, Hollanda merkezli bir gıda şirketine aittir ve Unilever tarafından  işletilmektedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()
        }


        val item9CardView = findViewById<CardView>(R.id.item9CardView)
        item9CardView.setOnClickListener {
            Toast.makeText(this,"The Coca-Cola Company tarafından üretilen bir meyve suyu markasıdır.Coca-Cola ADL'ye yazdığı bir mektupta, küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()
        }

        val item10CardView = findViewById<CardView>(R.id.item10CardView)
        item10CardView.setOnClickListener {
            Toast.makeText(this, " Temmuz 2015'te Carrefour payları birleştirilerek tek hisse kodu altında işlem görmeye başladı. 25 Temmuz 2013'te Sabancı Holding, 141 Milyon Lira Carrefour Nederland BV'den %12 hisse daha alarak payını %50,8'e çıkartmış ve yönetimi devralmıştır.Carrefour, 2021 yılındaki İsrail-Filistin çatışmaları sırasında, İsrail ordusuna gıda ve diğer malzemeler bağışlamıştır.",Toast.LENGTH_LONG).show()
        }





        val item11CardView = findViewById<CardView>(R.id.item11CardView)
        item11CardView.setOnClickListener {
            Toast.makeText(this,"Magnum, Cornetto, Cartedor, Max alt markalarıyla Algida dondurmaları,Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()
        }

        val item12CardView = findViewById<CardView>(R.id.item12CardView)
        item12CardView.setOnClickListener {
            Toast.makeText(this, "Çerezza,Cheetos,Ruffles,Lays ve Doritos PepsiCo alt markalarıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()
        }


        val item13CardView = findViewById<CardView>(R.id.item13CardView)
        item13CardView.setOnClickListener {
            Toast.makeText(this," Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()
        }

        val item14CardView = findViewById<CardView>(R.id.item14CardView)
        item14CardView.setOnClickListener {
            Toast.makeText(this, "İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu",Toast.LENGTH_LONG).show()
        }


        val item15CardView = findViewById<CardView>(R.id.item15CardView)
        item15CardView.setOnClickListener {
            Toast.makeText(this,"Magnum, Cornetto, Cartedor, Max alt markalarıyla Algida dondurmaları,Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()
        }

        val item16CardView = findViewById<CardView>(R.id.item16CardView)
        item16CardView.setOnClickListener {
            Toast.makeText(this, "İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()
        }


        val item17CardView = findViewById<CardView>(R.id.item17CardView)
        item17CardView.setOnClickListener {
            Toast.makeText(this,"Çerezza,Cheetos,Ruffles,Lays ve Doritos PepsiCo alt markalarıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()
        }

        val item18CardView = findViewById<CardView>(R.id.item18CardView)
        item18CardView.setOnClickListener {
            Toast.makeText(this, "İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()
        }


        val item19CardView = findViewById<CardView>(R.id.item19CardView)
        item19CardView.setOnClickListener {
            Toast.makeText(this,"Damla,CocaCola 'nın alt markasıdır.Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()
        }

        val item20CardView = findViewById<CardView>(R.id.item20CardView)
        item20CardView.setOnClickListener {
            Toast.makeText(this, "Danissimo,Danone şirketine ait bir markadır ve Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturmakla birlikte Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }




        val item21CardView = findViewById<CardView>(R.id.item21CardView)
        item21CardView.setOnClickListener {
            Toast.makeText(this,"Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturuyor. Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }

        val item22CardView = findViewById<CardView>(R.id.item22CardView)
        item22CardView.setOnClickListener {
            Toast.makeText(this, "Doğadan,Coca-Cola'nın alt markasıdır. Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()
        }

        val item23CardView = findViewById<CardView>(R.id.item23CardView)
        item23CardView.setOnClickListener {
            Toast.makeText(this,"Amerika menşeeli Domino’s Pizza İsrail işgaliyle birlikte İsrail bayrağı ve İbranice olarak “Bizi Kim Yenebilir” mesajıyla paylaşımlarda bulunarak İsrail askerlerine ücretsiz pizza dağıtımı yaptığını duyurmuştur.",Toast.LENGTH_LONG).show()
        }

        val item24CardView = findViewById<CardView>(R.id.item24CardView)
        item24CardView.setOnClickListener {
            Toast.makeText(this, "Çerezza,Cheetos,Ruffles,Lays ve Doritos PepsiCo alt markalarıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()
        }

        val item25CardView = findViewById<CardView>(R.id.item25CardView)
        item25CardView.setOnClickListener {
            Toast.makeText(this,"İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()
        }

        val item26CardView = findViewById<CardView>(R.id.item26CardView)
        item26CardView.setOnClickListener {
            Toast.makeText(this, "Evian,bir Danone markasıdır.Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturuyor. Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }


        val item27CardView = findViewById<CardView>(R.id.item27CardView)
        item27CardView.setOnClickListener {
            Toast.makeText(this,"Falım,bir Mondelez markasıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()
        }

        val item28CardView = findViewById<CardView>(R.id.item28CardView)
        item28CardView.setOnClickListener {
            Toast.makeText(this, "Fanta,Coca-Cola'nın alt markasıdır. Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()
        }

        val item29CardView = findViewById<CardView>(R.id.item29CardView)
        item29CardView.setOnClickListener {
            Toast.makeText(this, "First,bir Mondelez markasıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()
        }


        val item30CardView = findViewById<CardView>(R.id.item30CardView)
        item30CardView.setOnClickListener {
            Toast.makeText(this,"Fritolay,bir PepsiCo alt markasıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()
        }





        val item31CardView = findViewById<CardView>(R.id.item31CardView)
        item31CardView.setOnClickListener {
            Toast.makeText(this,"Pepsi,Fruko,Zup,Lipton ve Tropicana içecek markaları Pepsi-Co'ya aittir.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()
        }

        val item32CardView = findViewById<CardView>(R.id.item32CardView)
        item32CardView.setOnClickListener {
            Toast.makeText(this,"Doğadan,Cappy,Coca-Cola,Damla,Fuse Tea,Fanta,Powerade ve Schweppes içecekleri Coca-Cola Company şirketinin alt markalarıdır.Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()
        }

        val item33CardView = findViewById<CardView>(R.id.item33CardView)
        item33CardView.setOnClickListener {
            Toast.makeText(this,"Hayat,bir Danone markasıdır.Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturuyor. Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()
        }

        val item34CardView = findViewById<CardView>(R.id.item34CardView)
        item34CardView.setOnClickListener {
            Toast.makeText(this,"Heinz Kraft ailesi, İsrail ile kültür, ekonomi ve hayırseverlik gibi çeşitli sektörleri kapsayan karmaşık bir ilişki kurdu. Spordaki liderlikleriyle tanınan Kraft ailesi, ekonomik büyümeyi ve teknolojik ilerlemeyi artırdığı iddia edilen Boston ve İsrail'i birbirine bağladı.",Toast.LENGTH_LONG).show()
        }

        val item35CardView = findViewById<CardView>(R.id.item35CardView)
        item35CardView.setOnClickListener {
            Toast.makeText(this,"Hellman's,Becel,Knorr,Calve,Algida,Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()
        }

        val item36CardView = findViewById<CardView>(R.id.item36CardView)
        item36CardView.setOnClickListener {
            Toast.makeText(this,"Jacobs,Kent,Ofçay,Falım,Şıpsevdi,Jelibon,Topitop,Milka,Olips,Toblerone vs.markalar, Mondelez'in alt markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()
        }

        val item37CardView = findViewById<CardView>(R.id.item37CardView)
        item37CardView.setOnClickListener {
            Toast.makeText(this,"Kent,Jacobs,Ofçay,Falım,Şıpsevdi,Jelibon,Topitop,Milka,Olips,Toblerone vs.markalar, Mondelez'in alt markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }

        val item38CardView = findViewById<CardView>(R.id.item38CardView)
        item38CardView.setOnClickListener {
            Toast.makeText(this,"KFC, Pizza Hut, Taco Bell gibi fast-food zincirlerinin sahibi Yum Brands'tir. Yum Brands’e bağlı restoran zincirlerinin işgal altında bulunan Filistin yerleşim yerlerinde çok sayıda şubeleri bulunmaktadır.",Toast.LENGTH_LONG).show()        }

        val item39CardView = findViewById<CardView>(R.id.item39CardView)
        item39CardView.setOnClickListener {
            Toast.makeText(this,"Kitkat,Crunch,Nescafe,Damak,Nesquik,Pure Life,Coffemate İsrail'de çok sayıda üretim tesisisi bulunan Nestle'nin alt markalarıdır.İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi olan Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }




        val item40CardView = findViewById<CardView>(R.id.item40CardView)
        item40CardView.setOnClickListener {
            Toast.makeText(this,"Knorr,Hellman's,Becel,Calve,Algida,Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()        }

        val item41CardView = findViewById<CardView>(R.id.item41CardView)
        item41CardView.setOnClickListener {
            Toast.makeText(this,"2015 yılında Kraft Foods ve Mondelez International şirketleri birleşmiştir.Mondelez, 2017 yılında işgal altındaki Filistin’de bulunan The Kitchen Hub adlı bir girişim merkezine yatırım yapmıştır. The Kitchen Hub, Filistinli girişimcilerin yeni ürünler ve hizmetler geliştirmelerine yardımcı olan bir kuruluştur. Mondelez’in bu yatırımı, Filistinlilerin topraklarına ve kaynaklarına el koyan İsrail işgali için maddi destek anlamına gelmektedir",Toast.LENGTH_LONG).show()        }

        val item42CardView = findViewById<CardView>(R.id.item42CardView)
        item42CardView.setOnClickListener {
            Toast.makeText(this,"Lays,Ruffles,Çerezza,Doritos,Rocco,Cheetos,Fritolay markaları Pepsi-Co'ya aittir.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

        val item43CardView = findViewById<CardView>(R.id.item43CardView)
        item43CardView.setOnClickListener {
            Toast.makeText(this,"Lipton Ice Tea,Pepsi,Fruko,Zup,Lipton ve Tropicana içecek markaları Pepsi-Co'ya aittir.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

        val item44CardView = findViewById<CardView>(R.id.item44CardView)
        item44CardView.setOnClickListener {
            Toast.makeText(this,"Magnum, Cornetto, Cartedor, Max alt markalarıyla Algida dondurmaları,Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()        }

        val item45CardView = findViewById<CardView>(R.id.item45CardView)
        item45CardView.setOnClickListener {
            Toast.makeText(this,"Gazze’deki soykırımın başlamasıyla birlikte, İsrail ordusuna her gün ücretsiz yemek sağladığını ve bu amaçla beş farklı şube açtığını duyurdu.",Toast.LENGTH_LONG).show()        }

        val item46CardView = findViewById<CardView>(R.id.item46CardView)
        item46CardView.setOnClickListener {
            Toast.makeText(this,"Milka,Missbon,Oreo,Olips,First,Tofita,Jacobs,Kent,Ofçay,Toblerone,Falım,Jelibon,Topitop,First Mondelez markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }

        val item47CardView = findViewById<CardView>(R.id.item47CardView)
        item47CardView.setOnClickListener {
            Toast.makeText(this,"Milupa,Milumil,Aptamil,Bebelac Danone firmasının alt markalarıdır. Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturuyor. Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu finanse etmekte ve Danone ile anlaşması bulunmaktadır.",Toast.LENGTH_LONG).show()        }

        val item48CardView = findViewById<CardView>(R.id.item48CardView)
        item48CardView.setOnClickListener {
            Toast.makeText(this,"Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }

        val item49CardView = findViewById<CardView>(R.id.item49CardView)
        item49CardView.setOnClickListener {
            Toast.makeText(this,"Markanın sahibi Nestle'dir.İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }




        val item50CardView = findViewById<CardView>(R.id.item50CardView)
        item50CardView.setOnClickListener {
            Toast.makeText(this,"Nescafe,Kitkat,Crunch,Damak,Nesquik,Pure Life,Coffemate İsrail'de çok sayıda üretim tesisisi bulunan Nestle'nin alt markalarıdır.İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi olan Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }

        val item51CardView = findViewById<CardView>(R.id.item51CardView)
        item51CardView.setOnClickListener {
            Toast.makeText(this,"Nesquik,Nescafe,Kitkat,Crunch,Damak,Pure Life,Coffemate İsrail'de çok sayıda üretim tesisisi bulunan Nestle'nin alt markalarıdır.İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi olan Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }

        val item52CardView = findViewById<CardView>(R.id.item52CardView)
        item52CardView.setOnClickListener {
            Toast.makeText(this,"Nestea, Nestlé & The Coca-Cola Company ortaklığıyla üretilen bir buzlu çay markasıdır.İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi olan Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }

        val item53CardView = findViewById<CardView>(R.id.item53CardView)
        item53CardView.setOnClickListener {
            Toast.makeText(this,"İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi olan Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }

        val item54CardView = findViewById<CardView>(R.id.item54CardView)
        item54CardView.setOnClickListener {
            Toast.makeText(this,"Ofçay,Milka,Missbon,Oreo,Olips,First,Tofita,Jacobs,Kent,Toblerone,Falım,Jelibon,Topitop,First Mondelez markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }

        val item55CardView = findViewById<CardView>(R.id.item55CardView)
        item55CardView.setOnClickListener {
            Toast.makeText(this,"Olips,Ofçay,Milka,Missbon,Oreo,First,Tofita,Jacobs,Kent,Toblerone,Falım,Jelibon,Topitop,First Mondelez markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }

        val item56CardView = findViewById<CardView>(R.id.item56CardView)
        item56CardView.setOnClickListener {
            Toast.makeText(this,"Oreo,Olips,Ofçay,Milka,Missbon,First,Tofita,Jacobs,Kent,Toblerone,Falım,Jelibon,Topitop,First Mondelez markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }

        val item57CardView = findViewById<CardView>(R.id.item57CardView)
        item57CardView.setOnClickListener {
            Toast.makeText(this,"Papa John's International, Inc. 50'den fazla ülkede 5 binden fazla restoranıyla hizmet veren Amerika merkezli bir şirkettir.ABD merkezli pizza zinciri Papa Johns, İsrail’in Gazze’ye saldırısı sırasında IDF (İsrail Ordusu) askerlerine bir çok yemek bağışı yapmış, açıktan desteğini göstermiştir.",Toast.LENGTH_LONG).show()        }

        val item58CardView = findViewById<CardView>(R.id.item58CardView)
        item58CardView.setOnClickListener {
            Toast.makeText(this,"PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

        val item59CardView = findViewById<CardView>(R.id.item59CardView)
        item59CardView.setOnClickListener {
            Toast.makeText(this,"Philadelphia, 1929'da Arnold Ruben tarafından kurulan krem peynir markasıdır. Kraft Foods (şu an Kraft Heinz Company) tarafından sahiplenilmektedir.Kraft ailesi, İsrail ile kültür, ekonomi ve hayırseverlik gibi çeşitli sektörleri kapsayan karmaşık bir ilişki kurdu. Spordaki liderlikleriyle tanınan Kraft ailesi, ekonomik büyümeyi ve teknolojik ilerlemeyi artırdığı iddia edilen Boston ve İsrail'i birbirine bağladı.",Toast.LENGTH_LONG).show()        }




        val item60CardView = findViewById<CardView>(R.id.item60CardView)
        item60CardView.setOnClickListener {
            Toast.makeText(this," Pizza Hut,Kfc, Taco Bell gibi fast-food zincirlerinin sahibi Yum Brands'tir. Yum Brands’e bağlı restoran zincirlerinin işgal altında bulunan Filistin yerleşim yerlerinde çok sayıda şubeleri bulunmaktadır.",Toast.LENGTH_LONG).show()        }

        val item61CardView = findViewById<CardView>(R.id.item61CardView)
        item61CardView.setOnClickListener {
            Toast.makeText(this,"Markanın sahibi Nestle'dir.İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }

        val item62CardView = findViewById<CardView>(R.id.item62CardView)
        item62CardView.setOnClickListener {
            Toast.makeText(this,"Powerade,Doğadan,Cappy,Coca-Cola,Damla,Fuse Tea,Fanta ve Schweppes içecekleri Coca-Cola Company şirketinin alt markalarıdır.Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()        }

        val item63CardView = findViewById<CardView>(R.id.item63CardView)
        item63CardView.setOnClickListener {
            Toast.makeText(this,"Markanın sahibi Nestle'dir.İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }

        val item64CardView = findViewById<CardView>(R.id.item64CardView)
        item64CardView.setOnClickListener {
            Toast.makeText(this,"Rama,Becel,Calve,Hellman's,Knorr,Algida Unilever'in alt markalarıdır.Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()        }

        val item65CardView = findViewById<CardView>(R.id.item65CardView)
        item65CardView.setOnClickListener {
            Toast.makeText(this,"Rocco Pepsi-Co şirketinin alt markasıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

        val item66CardView = findViewById<CardView>(R.id.item66CardView)
        item66CardView.setOnClickListener {
            Toast.makeText(this,"Ruffles,Çerezza,Doritos,Lays,Rocco,Cheetos,Fritolay markaları Pepsi-Co'ya aittir.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

        val item67CardView = findViewById<CardView>(R.id.item67CardView)
        item67CardView.setOnClickListener {
            Toast.makeText(this,"Sana,Rama,Becel,Calve,Hellman's,Knorr,Algida Unilever'in alt markalarıdır.Unilever şirketinin bünyesindedir.Unilever, İsrail’in büyük gıda işletmelerinden Strauss Group’un ana hissedarlarından biridir ve Strauss Group’un iş ortağıdır.",Toast.LENGTH_LONG).show()        }

        val item68CardView = findViewById<CardView>(R.id.item68CardView)
        item68CardView.setOnClickListener {
            Toast.makeText(this,"Schweppes Pepsi-Co şirketinin alt markasıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

        val item69CardView = findViewById<CardView>(R.id.item69CardView)
        item69CardView.setOnClickListener {
            Toast.makeText(this,"Sırma,bir Danone markasıdır.Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturuyor. Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()        }




        val item70CardView = findViewById<CardView>(R.id.item70CardView)
        item70CardView.setOnClickListener {
            Toast.makeText(this,"Pfizer Nutrisyon'un global satın alımını gerçekleştiren Nestlé SMA bebek mamalarını portföyüne ekledi.İsrail'de çok sayıda üretim tesisisi bulunan Nestle,İsrail’in önemli gıda işletmesi olan Osem Investments’ın da sahibi.Nestle,Gazze Şeridi Sderot bölgesinde bir ARGE Merkezi kurdu.",Toast.LENGTH_LONG).show()        }


        val item71CardView = findViewById<CardView>(R.id.item71CardView)
        item71CardView.setOnClickListener {
            Toast.makeText(this," The Coca-Cola Company tarafından 1961'den beri üretilmektedir.Coca-Cola,ADL'ye yazdığı bir mektupta küresel içecek şirketinin İsrail'e karşı BDS hareketini desteklemediğini, onaylamadığını veya yaptırım uygulamadığını ve şirketin hem İsrail hem de Filistin'de ekonomik fırsat sağlamaktan ve geçim kaynaklarını desteklemekten gurur duyduğunu belirtmiştir.",Toast.LENGTH_LONG).show()        }


        val item72CardView = findViewById<CardView>(R.id.item72CardView)
        item72CardView.setOnClickListener {
            Toast.makeText(this,"Starbucks’ın kurucusu ve eski CEO’su Howard Schultz, İsrail’deki Aish HaTorah’ın Kudüs Fonu tarafından onurlandırılan liderlerdendir.ABD ile İsrail arasındaki ittifakın sağlamlaşmasında ciddi katkısı olmuştur ve İsrail bu katkılarını “İsrail’in 50. Yıldönümü Övgü Ödülü” ile ödüllendirmiştir. ",Toast.LENGTH_LONG).show()        }


        val item73CardView = findViewById<CardView>(R.id.item73CardView)
        item73CardView.setOnClickListener {
            Toast.makeText(this,"Tikveşli,bir Danone markasıdır.Danone İsrail’in 2. büyük gıda şirketidir. Siyonist ekonomiye kaynak oluşturuyor. Strauss Group’un %20'sine sahip.Strauss Group ise direkt olarak İsrail ekonomisini besleyen bir şirket.İsrail ordusunu destekliyor ve Danone ile anlaşması bulunuyor.",Toast.LENGTH_LONG).show()        }


        val item74CardView = findViewById<CardView>(R.id.item74CardView)
        item74CardView.setOnClickListener {
            Toast.makeText(this,"Toblerone,Oreo,Olips,Ofçay,Milka,Missbon,First,Tofita,Jacobs,Kent,Falım,Jelibon,Topitop,First Mondelez markalarıdır.Mondelez,Kraft Foods’un önemli bir şirketidir.İsrailli The Kitchen şirketine ve işgal edilen Filistin topraklarındaki İsrail şirketlerine yatırım yapıyor.",Toast.LENGTH_LONG).show()        }


        val item75CardView = findViewById<CardView>(R.id.item75CardView)
        item75CardView.setOnClickListener {
            Toast.makeText(this,"Tropicana Pepsi-Co şirketinin alt markasıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }


        val item76CardView = findViewById<CardView>(R.id.item76CardView)
        item76CardView.setOnClickListener {
            Toast.makeText(this,"Yedigün Pepsi-Co şirketinin alt markasıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }


        val item77CardView = findViewById<CardView>(R.id.item77CardView)
        item77CardView.setOnClickListener {
            Toast.makeText(this,"Zup Pepsi-Co şirketinin alt markasıdır.PepsiCo, İsrail merkezli SodaStream markasınının tümüne ve Sabra markasının yarısına sahiptir.Strauss Group ise Sabra markasının büyük hissedarıdır. Strauss Group, İsrail askeri birimlerine destek ve malzeme tedariki sağlamaktadır.",Toast.LENGTH_LONG).show()        }

    }
}