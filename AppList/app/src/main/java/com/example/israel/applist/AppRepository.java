package com.example.israel.applist;

import java.util.ArrayList;

public class AppRepository {

    private static ArrayList<AppListing> appListings;

    public static ArrayList<AppListing> getAppListings() {
        if (appListings == null) {
            parseData();
        }

        return appListings;
    }

    private static void parseData() {
        appListings = new ArrayList<>(APP_DATA.length());

        String[] lines = APP_DATA.split("\n");

        for (int i = 1; i < lines.length; ++i) {
            String[] data = lines[i].split(",");

            // looping through data prevents error for an incomplete csv row
            // but still allow data to be read
            String id = null;
            String appName = null;
            String appVersion = null;
            String domainName = null;
            String contactEmail = null;
            String imageUrl = null;
            for (int j = 0; j < data.length; ++j) {
                switch (j) {
                    case 0: id = data[j]; break;
                    case 1: appName = data[j]; break;
                    case 2: appVersion = data[j]; break;
                    case 3: domainName = data[j]; break;
                    case 4: contactEmail = data[j]; break;
                    case 5: imageUrl = data[j]; break;
                }
            }

            appListings.add(new AppListing(
                    id,
                    appName,
                    appVersion,
                    domainName,
                    contactEmail,
                    imageUrl
            ));

            // this can cause an index oob if a csv row is incomplete
//            appListings.add(new AppListing(
//                    data[0],
//                    data[1],
//                    data[2],
//                    data[3],
//                    data[4],
//                    data[5]
//            ));
        }
    }

    private static final String APP_DATA = "id,app_name,app_version,domain_name,contact_email,image_url\n" +
            "1,Tresom,0.18,php.net,bboick0@bravesites.com,http://dummyimage.com/169x140.jpg/dddddd/000000\n" +
            "2,Cookley,0.86,cbslocal.com,jkobierra1@webs.com,http://dummyimage.com/131x216.bmp/cc0000/ffffff\n" +
            "3,Zoolab,3.09,economist.com,istiling2@wikipedia.org,http://dummyimage.com/241x129.jpg/5fa2dd/ffffff\n" +
            "4,Job,3.74,google.it,npaeckmeyer3@go.com,http://dummyimage.com/148x177.jpg/dddddd/000000\n" +
            "5,Voltsillam,7.15,xrea.com,cdevillier4@imgur.com,http://dummyimage.com/163x100.jpg/5fa2dd/ffffff\n" +
            "6,Span,5.27,indiatimes.com,cwahlberg5@mozilla.com,http://dummyimage.com/151x131.png/dddddd/000000\n" +
            "7,Subin,0.37,cam.ac.uk,bstriker6@pcworld.com,http://dummyimage.com/156x192.png/dddddd/000000\n" +
            "8,Mat Lam Tam,1.50,wikimedia.org,gsawtell7@vinaora.com,http://dummyimage.com/127x171.bmp/ff4444/ffffff\n" +
            "9,Lotstring,9.7,feedburner.com,dmacfarlane8@unc.edu,http://dummyimage.com/210x219.jpg/5fa2dd/ffffff\n" +
            "10,Latlux,3.1,yahoo.com,cbehr9@chron.com,http://dummyimage.com/147x219.png/dddddd/000000\n" +
            "11,Daltfresh,0.31,ehow.com,kfishbournea@angelfire.com,http://dummyimage.com/172x205.jpg/cc0000/ffffff\n" +
            "12,Asoka,1.51,xing.com,fmcilvaneyb@yellowpages.com,http://dummyimage.com/215x232.jpg/ff4444/ffffff\n" +
            "13,Duobam,9.3,edublogs.org,pwilflingc@ucoz.com,http://dummyimage.com/128x199.jpg/dddddd/000000\n" +
            "14,Zaam-Dox,3.00,sun.com,bcaultond@techcrunch.com,http://dummyimage.com/147x153.bmp/5fa2dd/ffffff\n" +
            "15,Zaam-Dox,0.2.1,psu.edu,rtuillere@ucla.edu,http://dummyimage.com/177x172.png/dddddd/000000\n" +
            "16,Overhold,0.61,mapquest.com,hhuggonf@is.gd,http://dummyimage.com/135x131.bmp/ff4444/ffffff\n" +
            "17,Fix San,0.9.3,newyorker.com,bduplang@example.com,http://dummyimage.com/217x220.png/cc0000/ffffff\n" +
            "18,Daltfresh,7.9.0,guardian.co.uk,fjoslinh@wp.com,http://dummyimage.com/189x125.jpg/cc0000/ffffff\n" +
            "19,Veribet,1.8.9,theatlantic.com,lhandshearti@theguardian.com,http://dummyimage.com/105x140.png/5fa2dd/ffffff\n" +
            "20,Cardify,1.9.1,java.com,aborkinj@phpbb.com,http://dummyimage.com/138x124.bmp/cc0000/ffffff\n" +
            "21,It,4.0,homestead.com,broderk@flickr.com,http://dummyimage.com/175x221.png/ff4444/ffffff\n" +
            "22,Asoka,0.7.4,constantcontact.com,kyuryatinl@abc.net.au,http://dummyimage.com/231x145.jpg/cc0000/ffffff\n" +
            "23,Keylex,5.9.3,cargocollective.com,rrenihanm@tumblr.com,http://dummyimage.com/102x109.bmp/dddddd/000000\n" +
            "24,Cardify,0.44,4shared.com,akondratenkon@goo.ne.jp,http://dummyimage.com/105x189.bmp/cc0000/ffffff\n" +
            "25,Zontrax,0.97,geocities.com,mloxleyo@tmall.com,http://dummyimage.com/165x181.png/cc0000/ffffff\n" +
            "26,Ventosanzap,0.1.7,bbb.org,vlakeyp@photobucket.com,http://dummyimage.com/246x189.jpg/cc0000/ffffff\n" +
            "27,Zaam-Dox,0.8.4,chicagotribune.com,ccoppingq@youtube.com,http://dummyimage.com/200x240.jpg/cc0000/ffffff\n" +
            "28,Domainer,9.45,wisc.edu,dsaxonr@yelp.com,http://dummyimage.com/235x202.png/dddddd/000000\n" +
            "29,Tresom,6.5,illinois.edu,saylesburys@cnn.com,http://dummyimage.com/131x198.png/ff4444/ffffff\n" +
            "30,Overhold,2.01,icio.us,mdillowt@edublogs.org,http://dummyimage.com/109x238.jpg/ff4444/ffffff\n" +
            "31,Bitchip,5.00,shutterfly.com,tvasselu@biblegateway.com,http://dummyimage.com/238x117.png/5fa2dd/ffffff\n" +
            "32,Trippledex,5.65,epa.gov,lgiraudyv@pen.io,http://dummyimage.com/194x160.bmp/ff4444/ffffff\n" +
            "33,Flowdesk,1.8,sakura.ne.jp,pkittlesw@berkeley.edu,http://dummyimage.com/213x141.bmp/ff4444/ffffff\n" +
            "34,Asoka,8.8,furl.net,fperigoex@ucoz.ru,http://dummyimage.com/246x127.bmp/cc0000/ffffff\n" +
            "35,Otcom,0.55,chron.com,cbickersy@last.fm,http://dummyimage.com/225x228.png/ff4444/ffffff\n" +
            "36,Overhold,8.7.7,narod.ru,skinverz@japanpost.jp,http://dummyimage.com/243x229.bmp/dddddd/000000\n" +
            "37,Y-Solowarm,0.9.2,storify.com,jpanas10@nyu.edu,http://dummyimage.com/213x230.bmp/ff4444/ffffff\n" +
            "38,Aerified,0.1.2,i2i.jp,mbagnell11@paginegialle.it,http://dummyimage.com/224x131.bmp/dddddd/000000\n" +
            "39,Voyatouch,0.3.4,wordpress.org,dgoscomb12@cpanel.net,http://dummyimage.com/242x212.jpg/ff4444/ffffff\n" +
            "40,Stringtough,4.6.9,ox.ac.uk,tbelcham13@whitehouse.gov,http://dummyimage.com/119x101.jpg/dddddd/000000\n" +
            "41,Tampflex,2.4,ucsd.edu,bbanasevich14@chronoengine.com,http://dummyimage.com/216x228.bmp/5fa2dd/ffffff\n" +
            "42,Lotlux,0.7.1,google.com.br,gwestwater15@posterous.com,http://dummyimage.com/231x225.png/cc0000/ffffff\n" +
            "43,Transcof,0.3.1,indiegogo.com,doshesnan16@indiegogo.com,http://dummyimage.com/200x119.jpg/ff4444/ffffff\n" +
            "44,Asoka,0.85,tmall.com,rbranca17@soup.io,http://dummyimage.com/226x161.bmp/5fa2dd/ffffff\n" +
            "45,Y-find,0.50,whitehouse.gov,bmatschoss18@salon.com,http://dummyimage.com/137x211.bmp/5fa2dd/ffffff\n" +
            "46,Sonsing,5.16,mozilla.org,jczadla19@joomla.org,http://dummyimage.com/188x144.bmp/5fa2dd/ffffff\n" +
            "47,Tres-Zap,0.7.1,ocn.ne.jp,wmcnaughton1a@t-online.de,http://dummyimage.com/209x232.bmp/cc0000/ffffff\n" +
            "48,Tempsoft,5.0,goodreads.com,bsherwyn1b@dropbox.com,http://dummyimage.com/102x199.png/ff4444/ffffff\n" +
            "49,Bytecard,0.6.7,amazonaws.com,bdraisey1c@unesco.org,http://dummyimage.com/199x220.bmp/dddddd/000000\n" +
            "50,Zamit,1.2,sina.com.cn,wrossander1d@mediafire.com,http://dummyimage.com/246x137.bmp/cc0000/ffffff\n" +
            "51,Zaam-Dox,0.8.8,nsw.gov.au,mmashro1e@nasa.gov,http://dummyimage.com/220x242.jpg/5fa2dd/ffffff\n" +
            "52,Tin,0.7.6,delicious.com,bhelliker1f@nsw.gov.au,http://dummyimage.com/234x244.png/cc0000/ffffff\n" +
            "53,Konklux,8.16,goo.gl,lronnay1g@blogspot.com,http://dummyimage.com/129x141.jpg/ff4444/ffffff\n" +
            "54,Biodex,7.4,wisc.edu,apreuvost1h@cdbaby.com,http://dummyimage.com/209x114.bmp/cc0000/ffffff\n" +
            "55,Job,5.6.7,slideshare.net,cmcgairl1i@msn.com,http://dummyimage.com/196x213.png/cc0000/ffffff\n" +
            "56,Zaam-Dox,8.4.0,hp.com,ldibson1j@state.tx.us,http://dummyimage.com/137x116.bmp/5fa2dd/ffffff\n" +
            "57,Veribet,7.5,foxnews.com,opickervance1k@china.com.cn,http://dummyimage.com/191x103.jpg/dddddd/000000\n" +
            "58,Greenlam,0.17,acquirethisname.com,bfuster1l@wordpress.com,http://dummyimage.com/248x102.png/dddddd/000000\n" +
            "59,Otcom,9.52,newsvine.com,henden1m@blinklist.com,http://dummyimage.com/155x144.png/cc0000/ffffff\n" +
            "60,Zontrax,0.36,marriott.com,temor1n@stumbleupon.com,http://dummyimage.com/195x179.jpg/dddddd/000000\n" +
            "61,Y-find,6.31,163.com,bbrightey1o@digg.com,http://dummyimage.com/182x103.jpg/5fa2dd/ffffff\n" +
            "62,Fintone,1.64,fotki.com,eelleray1p@theguardian.com,http://dummyimage.com/117x107.jpg/cc0000/ffffff\n" +
            "63,Solarbreeze,3.7.9,economist.com,spymer1q@flavors.me,http://dummyimage.com/151x161.jpg/cc0000/ffffff\n" +
            "64,Subin,0.6.1,cisco.com,sbadgers1r@harvard.edu,http://dummyimage.com/197x248.png/dddddd/000000\n" +
            "65,Matsoft,5.36,oakley.com,mrefford1s@exblog.jp,http://dummyimage.com/147x143.png/5fa2dd/ffffff\n" +
            "66,Tempsoft,0.19,wikipedia.org,hgovini1t@amazon.de,http://dummyimage.com/130x106.png/cc0000/ffffff\n" +
            "67,Aerified,0.8.6,businessinsider.com,dpethybridge1u@twitpic.com,http://dummyimage.com/248x148.bmp/dddddd/000000\n" +
            "68,Hatity,9.11,mayoclinic.com,arein1v@seattletimes.com,http://dummyimage.com/242x139.png/ff4444/ffffff\n" +
            "69,Pannier,0.74,timesonline.co.uk,jdenys1w@dell.com,http://dummyimage.com/188x237.jpg/ff4444/ffffff\n" +
            "70,Bitchip,5.92,networksolutions.com,tstallen1x@technorati.com,http://dummyimage.com/126x188.jpg/5fa2dd/ffffff\n" +
            "71,Holdlamis,2.8.2,mapy.cz,cpaulucci1y@earthlink.net,http://dummyimage.com/188x165.jpg/dddddd/000000\n" +
            "72,Otcom,6.6.0,un.org,sguilliland1z@bandcamp.com,http://dummyimage.com/162x104.jpg/cc0000/ffffff\n" +
            "73,Opela,4.9,boston.com,zgurge20@discovery.com,http://dummyimage.com/100x123.jpg/5fa2dd/ffffff\n" +
            "74,Konklux,4.73,netscape.com,kkelinge21@ask.com,http://dummyimage.com/214x153.jpg/dddddd/000000\n" +
            "75,Lotlux,3.4,businessweek.com,sdanford22@disqus.com,http://dummyimage.com/136x204.jpg/cc0000/ffffff\n" +
            "76,Toughjoyfax,8.37,wired.com,cyeates23@istockphoto.com,http://dummyimage.com/216x212.jpg/ff4444/ffffff\n" +
            "77,Zathin,5.01,springer.com,plarose24@apple.com,http://dummyimage.com/203x211.bmp/5fa2dd/ffffff\n" +
            "78,Y-find,4.6.3,fema.gov,codriscole25@woothemes.com,http://dummyimage.com/201x140.png/5fa2dd/ffffff\n" +
            "79,Gembucket,0.54,liveinternet.ru,jhannaway26@prnewswire.com,http://dummyimage.com/149x242.jpg/5fa2dd/ffffff\n" +
            "80,Temp,0.56,seattletimes.com,lclerc27@newyorker.com,http://dummyimage.com/133x199.png/dddddd/000000\n" +
            "81,Lotstring,3.02,samsung.com,rdietzler28@mail.ru,http://dummyimage.com/120x249.jpg/ff4444/ffffff\n" +
            "82,Tresom,0.88,amazon.com,scoulsen29@examiner.com,http://dummyimage.com/218x179.bmp/cc0000/ffffff\n" +
            "83,Fixflex,0.4.2,nasa.gov,fdilley2a@domainmarket.com,http://dummyimage.com/129x119.bmp/dddddd/000000\n" +
            "84,Fix San,0.9.5,baidu.com,pmillis2b@europa.eu,http://dummyimage.com/173x235.png/dddddd/000000\n" +
            "85,Stim,4.0.8,goo.gl,aadlard2c@google.ru,http://dummyimage.com/161x236.bmp/cc0000/ffffff\n" +
            "86,Flexidy,4.38,gov.uk,nrockwill2d@reuters.com,http://dummyimage.com/172x115.bmp/dddddd/000000\n" +
            "87,Alpha,6.9.4,163.com,rbussel2e@goodreads.com,http://dummyimage.com/137x129.png/dddddd/000000\n" +
            "88,Zaam-Dox,5.2.9,goo.ne.jp,mmollen2f@miitbeian.gov.cn,http://dummyimage.com/172x216.bmp/5fa2dd/ffffff\n" +
            "89,Voltsillam,3.6.4,prnewswire.com,mdoneld2g@newsvine.com,http://dummyimage.com/170x165.bmp/cc0000/ffffff\n" +
            "90,Transcof,4.8,mozilla.com,rnorthrop2h@npr.org,http://dummyimage.com/216x232.bmp/dddddd/000000\n" +
            "91,Stim,9.90,delicious.com,cocollopy2i@fema.gov,http://dummyimage.com/134x131.jpg/5fa2dd/ffffff\n" +
            "92,Alphazap,1.2.8,biblegateway.com,sbiss2j@bloglovin.com,http://dummyimage.com/180x172.jpg/dddddd/000000\n" +
            "93,Zathin,0.3.2,yahoo.co.jp,ftabary2k@gizmodo.com,http://dummyimage.com/247x200.png/dddddd/000000\n" +
            "94,Voyatouch,2.79,discuz.net,awhannel2l@etsy.com,http://dummyimage.com/231x208.jpg/ff4444/ffffff\n" +
            "95,Solarbreeze,7.4,chicagotribune.com,agallop2m@1und1.de,http://dummyimage.com/160x149.png/ff4444/ffffff\n" +
            "96,Cookley,3.1.3,salon.com,vteese2n@tinypic.com,http://dummyimage.com/220x241.png/5fa2dd/ffffff\n" +
            "97,Rank,8.5,trellian.com,dburrass2o@amazon.co.jp,http://dummyimage.com/225x118.png/ff4444/ffffff\n" +
            "98,Vagram,9.88,sogou.com,kpresdee2p@alibaba.com,http://dummyimage.com/136x112.jpg/dddddd/000000\n" +
            "99,Sonsing,0.63,arizona.edu,npurkins2q@nba.com,http://dummyimage.com/211x219.bmp/5fa2dd/ffffff\n" +
            "100,Otcom,2.0,storify.com,cmarzella2r@lulu.com,http://dummyimage.com/111x243.png/cc0000/ffffff";
}
