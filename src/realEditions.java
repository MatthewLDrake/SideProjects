
public class realEditions
{
    private entryInfo[] contestInfo;
    private int host, amountCountries;
    public realEditions(String edition)
    {

	host = 0;
	int edi = Integer.parseInt(edition);
	switch (edi)
	{
	case 1:		contestInfo = new entryInfo[8];
	amountCountries = 8;
	ISC1();
	break;
	case 2:		contestInfo = new entryInfo[24];
	amountCountries = 24;
	ISC2();
	break;
	case 3:		contestInfo = new entryInfo[23];
	amountCountries = 23;
	ISC3();
	break;
	case 4:		contestInfo = new entryInfo[21];
	amountCountries = 21;
	ISC4();
	break;
	case 5:		contestInfo = new entryInfo[19];
	amountCountries = 19;
	ISC5();
	break;
	case 6:		contestInfo = new entryInfo[23];
	amountCountries = 23;
	ISC6();
	break;
	case 7:		contestInfo = new entryInfo[26];
	amountCountries = 26;
	ISC7();
	break;
	case 8:		contestInfo = new entryInfo[35];
	amountCountries = 35;
	ISC8();
	break;
	case 9:		contestInfo = new entryInfo[43];
	amountCountries = 43;
	ISC9();
	break;
	case 38:	contestInfo = new entryInfo[54];
	amountCountries = 54;
	ISC38();
	break;
	case 39:	contestInfo = new entryInfo[55];
	amountCountries = 55;
	ISC39();
	break;
	case 40:	contestInfo = new entryInfo[55];
	amountCountries = 55;
	ISC40();
	break;
	case 41:	contestInfo = new entryInfo[54];
	amountCountries = 54;
	ISC41();
	break;
	case 42:	contestInfo = new entryInfo[54];
	amountCountries = 54;
	ISC42();
	break;
	case 43:	contestInfo = new entryInfo[52];
	amountCountries = 52;
	ISC43();
	break;
	case 44:	contestInfo = new entryInfo[54];
	amountCountries =54;
	ISC44();
	break;
	case 45:	contestInfo = new entryInfo[54];
	amountCountries = 54;
	ISC45();
	break;
	case 46:	contestInfo = new entryInfo[55];
	amountCountries = 55;
	ISC46();
	break;
	case 47:	contestInfo = new entryInfo[55];
	amountCountries = 55;
	ISC47();
	break;
	case 48:	contestInfo = new entryInfo[55];
	amountCountries = 55;
	ISC48();
	break;
	case 49:	contestInfo = new entryInfo[54];
	amountCountries = 54;
	ISC49();
	break;
	case 50:	contestInfo = new entryInfo[54];
	amountCountries = 54;
	ISC50();
	break;
	default: System.out.println("That was an incorrect number, that edition has not been yet implemented.");
	System.exit(0);

	}
    }
    private void ISC1()
    {
	contestInfo[0] = new entryInfo("Grolskira",4, "Grolskira", "Lily Allen", "22");
	contestInfo[1] = new entryInfo("Territrius",1, "Territrius", "Katzenjammer", "Hey ho on the Devil's back");
	contestInfo[2] = new entryInfo("Dysprosia",2, "Dysprosia", "Tina Cross", "Nothing But Dreams");
	contestInfo[3] = new entryInfo("Spirevo",5, "Spirevo", "Happoradio", "Ahmat tulevat");
	contestInfo[4] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Ri Kyong Suk", "The Leader Has Come To Our Outpost");
	contestInfo[5] = new entryInfo("Tashkveny",3, "Tashkveny", "Inna Modja", "French Cancan");
	contestInfo[6] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Keri Hilson", "Pretty Girl Rock");
	contestInfo[7] = new entryInfo("T.E.T.R.I.S.",1, "T.E.T.R.I.S.", "Son of Dork", "Slacker");


	host = 3;
    }
    private void ISC2()
    {
	contestInfo[0] = new entryInfo("Anselmsuusonia",3, "Anselmsuusonia", "Karmin", "Hello");
	contestInfo[1] = new entryInfo("Brickistan",2, "Brickistan", "Neo", "Pushing Darkness");
	contestInfo[2] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Kim Jong Nyo", "Songun Victory Calendar");
	contestInfo[3] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Lisa Miskovsky", "Still Alive");
	contestInfo[4] = new entryInfo("Eriod",1, "Eriod", "John Cage", "4:33");
	contestInfo[5] = new entryInfo("Grolskira",4, "Grolskira", "Kylie Minogue", "Timebomb");
	contestInfo[6] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Moranbong Band", "승리자들 (Victors)");
	contestInfo[7] = new entryInfo("Kosma",2, "Kosma", "Katya Ryabova", "Chunga changa");
	contestInfo[8] = new entryInfo("Luzze",2, "Luzze", "Laura Närhi", "Kuutamolla (Se ei mee pois)");
	contestInfo[9] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Matt Dusk", "Back in Town");
	contestInfo[10] = new entryInfo("San Monique",5, "San Monique", "Aura Dione", "Geronimo");
	contestInfo[11] = new entryInfo("Sibinia",5, "Sibinia", "Nightwish", "The Crow the Owl and the Dove");
	contestInfo[12] = new entryInfo("Sockistan",1, "Sockistan", "Queen Zee", "Boy You Know");
	contestInfo[13] = new entryInfo("Spirevo",2, "Spirevo", "Amanda Palmer", "Leeds United");
	contestInfo[14] = new entryInfo("Sunetti",5, "Sunetti", "Nina Zilli", "Per le strade");
	contestInfo[15] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Marina & The Diamonds", "Radioactive");
	contestInfo[16] = new entryInfo("Tashkveny",3, "Tashkveny", "Mylène Farmer", "Pourvu qu'elles soient douces");
	contestInfo[17] = new entryInfo("Territrius",1, "Territrius", "Anouk", "One Word");
	contestInfo[18] = new entryInfo("Tikata",1, "Tikata", "Fallulah", "Give Us a Little Love");
	contestInfo[19] = new entryInfo("Tonallán",2, "Tonallan", "Mariana Seoane", "Una de dos");
	contestInfo[20] = new entryInfo("Üürnikoise",1, "Üürnikoise", "Ashes to Beauty", "Savior");
	contestInfo[21] = new entryInfo("Volnytaria",5, "Volnytaria", "CocoRosie", "Beautiful Boyz");
	contestInfo[22] = new entryInfo("Winterlune",2, "Winterlune", "Sophie Ellis-Bextor", "Murder on the Dancefloor");
	contestInfo[23] = new entryInfo("Xhanostania",4, "Xhanostania", "Cristina Rus", "I Don't See Ya");

	
	host = 13;
    }
    
    private void ISC3()
    {
	contestInfo[0] = new entryInfo("Anselmsuusonia",3, "Anselmsuusonia", "Johann Sebastian Bach", "Toccata & Fuga In D Minor");
	contestInfo[1] = new entryInfo("Brickistan",2, "Brickistan", "Mika", "Stardust");
	contestInfo[2] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Andriëtte Norman", "Vat my hoër");
	contestInfo[3] = new entryInfo("Grolskira",4, "Grolskira", "Inna", "Club Rocker");
	contestInfo[4] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Wangjaesan Art Troupe Of DPRK", "Moskau");
	contestInfo[5] = new entryInfo("Irlandia",2, "Irlandia", "Olivia Newton-John", "Magic");
	contestInfo[6] = new entryInfo("Kosma",2, "Kosma", "Soraya", "Sólo por ti");
	contestInfo[7] = new entryInfo("Luzze",2, "Luzze", "LAB", "Machine Girl");
	contestInfo[8] = new entryInfo("Mukaltin",5, "Mukaltin", "Florence and The Machine", "Seven Devils");
	contestInfo[9] = new entryInfo("Randomia",4, "Randomia", "Foster The People", "Houdini");
	contestInfo[10] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Kerrie Roberts", "Rescue Me (How the Story Ends)");
	contestInfo[11] = new entryInfo("San Monique",5, "San Monique", "Electric Lady Lab", "Taking Off");
	contestInfo[12] = new entryInfo("Sibinia",5, "Sibinia", "Alan Dawa Dolma", "Kuon no Kawa");
	contestInfo[13] = new entryInfo("Sockistan",1, "Sockistan", "Duo505", "Wenig");
	contestInfo[14] = new entryInfo("Spirevo",2, "Spirevo", "Airport Impressions", "Elusive");
	contestInfo[15] = new entryInfo("Sunetti",5, "Sunetti", "Elena Risteska", "A moževme");
	contestInfo[16] = new entryInfo("Swelatie",2, "Swelatie", "Brad Paisley feat. Carrie Underwood", "Remind Me");
	contestInfo[17] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Ashanti", "The Way That I Love You");
	contestInfo[18] = new entryInfo("Tashkveny",3, "Tashkveny", "Capercaillie", "Urnaigh a'bhan");
	contestInfo[19] = new entryInfo("Territrius",1, "Territrius", "Nina Hagen", "Der Spinner");
	contestInfo[20] = new entryInfo("Tikata",1, "Tikata", "Thalía", "Entre el mar y una estrella");
	contestInfo[21] = new entryInfo("Tonallán",2, "Tonallan", "El Gran Silencio", "Chúntaro Style");
	contestInfo[22] = new entryInfo("Üürnikoise",1, "Üürnikoise", "Mia Aegerten", "Finger i d'Ohre");
	
	host = 19;
    }
    private void ISC4()
    {
	contestInfo[0] = new entryInfo("Brickistan",2, "Brickistan", "Dan Black", "Symphonies");
	contestInfo[1] = new entryInfo("DimkaRUS",4, "DimkaRUS", "Era", "Mother");
	contestInfo[2] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Elizma Theron", "Makie Sakie");
	contestInfo[3] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Carrie Underwood", "Ever Ever After");
	contestInfo[4] = new entryInfo("Grolskira",4, "Grolskira", "Voltaire", "So Still");
	contestInfo[5] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "North Korean woman", "Smuglyanka Moldavanka");
	contestInfo[6] = new entryInfo("Kosma",2, "Kosma", "Chisu", "Yksinäisen keijun tarina");
	contestInfo[7] = new entryInfo("Luzze",2, "Luzze", "Studio Killers", "Ode to the Bouncer");
	contestInfo[8] = new entryInfo("Mukaltin",5, "Mukaltin", "Crystal Castles", "Baptism");
	contestInfo[9] = new entryInfo("San Monique",5, "San Monique", "Of Monsters & Men", "Little Talks");
	contestInfo[10] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Amy Grant", "Eye To Eye");
	contestInfo[12] = new entryInfo("Spirevo",2, "Spirevo", "Jack's Mannequin", "Dark Blue");
	contestInfo[13] = new entryInfo("Sunetti",5, "Sunetti", "Adele", "Skyfall");
	contestInfo[14] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Carly Rae Jepsen", "Hurt So Good");
	contestInfo[15] = new entryInfo("Tashkveny",3, "Tashkveny", "Coeur de Pirate", "C'était salement romantique");
	contestInfo[16] = new entryInfo("Territrius",1, "Territrius", "SNIPERmicSNIPER", "Super Mario (Dubstep Remix)");
	contestInfo[17] = new entryInfo("Tikata",1, "Tikata", "Janis Joplin", "Piece of My Heart");
	contestInfo[18] = new entryInfo("Tonallán",2, "Tonallan", "Peter Murphy", "Subway");
	contestInfo[19] = new entryInfo("Üürnikoise",1, "Üürnikoise", "Sarah Brightman", "Sanvean");
	contestInfo[20] = new entryInfo("Volnytaria",5, "Volnytaria", "Lily Allen", "Fuck You");
	
	host = 13;

    }
    private void ISC5()
    {
	contestInfo[0] = new entryInfo("DimkaRUS",4, "DimkaRUS", "Tic Tac Toe", "Warum");
	contestInfo[1] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Kirsten", "Tausend kleine Mädchen");
	contestInfo[2] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Jason Paige", "Pokémon Theme Song");
	contestInfo[3] = new entryInfo("Grolskira",4, "Grolskira", "Nolwenn Leroy", "Tri Martolod");
	contestInfo[4] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Murumpuyo", "Question Mark");
	contestInfo[5] = new entryInfo("Irlandia",2, "Irlandia", "Katy Perry", "I Kissed a Girl");
	contestInfo[6] = new entryInfo("Kosma",2, "Kosma", "Celine Dion", "Parler à mon père");
	contestInfo[7] = new entryInfo("Mukaltin",5, "Mukaltin", "Kola Bel'dy", "Khanina-Ranina");
	contestInfo[8] = new entryInfo("Novatlantida",2, "Novatlantida", "Florence + The Machine", "No Light No Light");
	contestInfo[9] = new entryInfo("San Monique",5, "San Monique", "Amy Grant", "Eye To Eye");
	contestInfo[10] = new entryInfo("SEAL",4, "SEAL", "Of Monsters & Men", "Little Talks");
	contestInfo[11] = new entryInfo("Sibinia",5, "Sibinia", "Toše Proeski", "Po tebe");
	contestInfo[12] = new entryInfo("Spirevo",2, "Spirevo", "Saint Lu", "Here I Stand");
	contestInfo[13] = new entryInfo("Sunetti",5, "Sunetti", "Evanescence", "My Immortal");
	contestInfo[14] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Maroon 5", "Misery");
	contestInfo[15] = new entryInfo("Tashkveny",3, "Tashkveny", "Ariane Moffat", "Je veux tout");
	contestInfo[16] = new entryInfo("Tikata",1, "Tikata", "Hoje", "A gaivota");
	contestInfo[17] = new entryInfo("Tonallán",2, "Tonallan", "Portishead", "All Mine");
	contestInfo[18] = new entryInfo("Volnytaria",5, "Volnytaria", "Annett Louisan", "Fettnäpfchenwetthüpfen");
	
	host = 11;
    }
    private void ISC6()
    {
	contestInfo[0] = new entryInfo("Anselmsuusonia",3, "Anselmsuusonia", "Shakira", "Ojos así");
	contestInfo[1] = new entryInfo("Brickistan",2, "Brickistan", "The Rasmus", "Help Me Sing");
	contestInfo[2] = new entryInfo("DimkaRUS",4, "DimkaRUS", "Enrique Iglesias", "Hero");
	contestInfo[3] = new entryInfo("Dinokratys & Shrikidai",2, "Dinokratys & Shrikidai", "Kimbra", "Cameo Lover");
	contestInfo[4] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Moranbong Band", "Mother's Voice");
	contestInfo[5] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Danielle Blakey", "Fearless");
	contestInfo[6] = new entryInfo("Grolskira",4, "Grolskira", "Marina and the Diamonds", "Primadonna");
	contestInfo[7] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Yun Hye Yong", "Battle For Leap Forward");
	contestInfo[8] = new entryInfo("Irlandia",2, "Irlandia", "Bellatrix", "Jediwannabe");
	contestInfo[9] = new entryInfo("Kosma",2, "Kosma", "Miguel Bosé feat. Ximena Sariñana", "Aire soy");
	contestInfo[10] = new entryInfo("Novatlantida",2, "Novatlantida", "Dazkarieh", "Caminhos turvos");
	contestInfo[11] = new entryInfo("Rötenrod",4, "Rötenrod", "Infernal", "Self Control");
	contestInfo[12] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Deborah Conway", "It's Only the Beginning");
	contestInfo[13] = new entryInfo("San Monique",5, "San Monique", "Ronya", "Hyperventilating");
	contestInfo[14] = new entryInfo("Sibinia",5, "Sibinia", "Shakira", "Whenever Wherever");
	contestInfo[15] = new entryInfo("Spirevo",2, "Spirevo", "ALyosha", "Sneg");
	contestInfo[16] = new entryInfo("Sunetti",5, "Sunetti", "Lana Jurčević & Luka Nizetić", "Prava ljubav");
	contestInfo[17] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Magazin", "Sijamski blizanci");
	contestInfo[18] = new entryInfo("Tashkveny",3, "Tashkveny", "Scala and Kolacny Brothers", "Creep");
	contestInfo[19] = new entryInfo("Territrius",1, "Territrius", "Richard Cocciant", "Marguerite");
	contestInfo[20] = new entryInfo("Tikata",1, "Tikata", "Hurts", "Wonderful Life");
	contestInfo[21] = new entryInfo("Tonallán",2, "Tonallan", "Eiza", "Te acordarás de mi");
	contestInfo[22] = new entryInfo("Volnytaria",5, "Volnytaria", "Mỹ Tâm", "Trắng Đen");
	
	host = 9;
    }
    private void ISC7()
    {
	contestInfo[0] = new entryInfo("Anselmsuusonia",3, "Anselmsuusonia", "Paloma Faith", "Upside Down");
	contestInfo[1] = new entryInfo("Bitland",1, "Bitland", "Homestuck", "Showtime");
	contestInfo[2] = new entryInfo("DimkaRUS",4, "DimkaRUS", "Rihanna", "Diamonds");
	contestInfo[3] = new entryInfo("Dinokratys & Shrikidai",2, "Dinokratys & Shrikidai", "Lady Gaga", "Born This Way");
	contestInfo[4] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Ri Kyong Suk", "Glad To See You");
	contestInfo[5] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Chiara Civello", "Problemi");
	contestInfo[6] = new entryInfo("Grolskira",4, "Grolskira", "Girls' Generation", "Paparazzi");
	contestInfo[7] = new entryInfo("Irdminia",4, "Irdminia", "Schiller feat. Anggun", "Innocent Lies");
	contestInfo[8] = new entryInfo("Irlandia",2, "Irlandia", "Blondie", "Susie & Jeffrey");
	contestInfo[9] = new entryInfo("Kosma",2, "Kosma", "Les Cowboys Fringants", "Paris-Montréal");
	contestInfo[10] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Kokia", "Follow The Nightingale");
	contestInfo[11] = new entryInfo("Novatlantida",2, "Novatlantida", "Jenni Vartiainen", "Ihmisten edessä");
	contestInfo[12] = new entryInfo("Oalia",3, "Oalia", "Robyn", "Indestructible");
	contestInfo[13] = new entryInfo("Rötenrod",4, "Rötenrod", "Jay Khan", "Nackt");
	contestInfo[14] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Kristína", "Life is a Game");
	contestInfo[15] = new entryInfo("San Monique",5, "San Monique", "Diandra", "Outta My Head");
	contestInfo[16] = new entryInfo("Sibinia",5, "Sibinia", "Sertab Erener", "Here I Am");
	contestInfo[17] = new entryInfo("Spirevo",2, "Spirevo", "María Villalón", "Aguita de Abril");
	contestInfo[18] = new entryInfo("Sunetti",5, "Sunetti", "Miligram ft. Kaliopi", "Nevinost");
	contestInfo[19] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Jovana Nikolic", "Moli Moli");
	contestInfo[20] = new entryInfo("Tashkveny",3, "Tashkveny", "Scissor Sisters", "Laura");
	contestInfo[21] = new entryInfo("Territrius",1, "Territrius", "Thundercore Empire", "Elektro Orgasmus");
	contestInfo[22] = new entryInfo("Tikata",1, "Tikata", "Doda", "Nie daj się");
	contestInfo[23] = new entryInfo("Tonallán",2, "Tonallan", "Eme 15", "Solamente Tú");
	contestInfo[24] = new entryInfo("Volnytaria",5, "Volnytaria", "The Bellamy Brothers", "If I Said You Had A Beautiful Body");
	contestInfo[25] = new entryInfo("Yazminia",2, "Yazminia", "Mago De Oz", "La Costa Del Silencio");
	
	
	host = 15;
    }
    private void ISC8()
    {
	contestInfo[0] = new entryInfo("Anselmsuusonia",3, "Anselmsuusonia", "Cœur De Pirate", "Golden Baby");
	contestInfo[1] = new entryInfo("Bitland",1, "Bitland", "The Bird and the Bee", "Love Letter to Japan");
	contestInfo[2] = new entryInfo("Canedonia",4, "Canedonia", "Area", "Frekfencija na Ljubovta");
	contestInfo[3] = new entryInfo("Carpathia",5, "Carpathia", "Anúna", "Heia Viri");
	contestInfo[4] = new entryInfo("DimkaRUS",4, "DimkaRUS", "Vanilla Ninja", "Don't Go Too Fast");
	contestInfo[5] = new entryInfo("Dinokratys & Shrikidai",2, "Dinokratys & Shrikidai", "Alina Orlova", "Vaiduokliai");
	contestInfo[6] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "Malena Ernman", "Sempre Libera");
	contestInfo[7] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Nianell", "Wense");
	contestInfo[8] = new entryInfo("Grolskira",4, "Grolskira", "Vlatko Lozanoski", "Nema Den Nema Nokj");
	contestInfo[9] = new entryInfo("Irdminia",4, "Irdminia", "Kelly Sweet", "Ready For Love");
	contestInfo[10] = new entryInfo("Irlandia",2, "Irlandia", "The Pearls", "You Came You Saw You Conquered");
	contestInfo[11] = new entryInfo("Kosma",2, "Kosma", "La Oreja de Van Gogh", "Cuídate");
	contestInfo[12] = new entryInfo("Kwonia",3, "Kwonia", "AOA", "Elvis");
	contestInfo[13] = new entryInfo("Lacrea",1, "Lacrea", "Bandana", "Guapas");
	contestInfo[14] = new entryInfo("Luzze",2, "Luzze", "Honey", "Sabotaż");
	contestInfo[15] = new entryInfo("Marvelia",5, "Marvelia", "Dido", "Everything To Lose");
	contestInfo[16] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Despina Vandi", "Girismata");
	contestInfo[17] = new entryInfo("Novatlantida",2, "Novatlantida", "Utada Hikaru", "Passion");
	contestInfo[18] = new entryInfo("Oalia",3, "Oalia", "Kalafina", "Kagayaku Sora no Shijima ni wa");
	contestInfo[19] = new entryInfo("Punitkov",5, "Punitkov", "Natalia Oreiro", "Cambio dolor");
	contestInfo[20] = new entryInfo("Rötenrod",4, "Rötenrod", "Savage Garden", "To The Moon and Back");
	contestInfo[21] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Sieneke", "Amore fantastico");
	contestInfo[22] = new entryInfo("San Monique",5, "San Monique", "Zara Larsson", "Uncover");
	contestInfo[23] = new entryInfo("San Remo",3, "San Remo", "Beth", "La Luz");
	contestInfo[24] = new entryInfo("Sibinia",5, "Sibinia", "Fox Lima", "Livre");
	contestInfo[25] = new entryInfo("Spirevo",2, "Spirevo", "Myahri", "Öňe Diňe Öňe");
	contestInfo[26] = new entryInfo("Sunetti",5, "Sunetti", "Nightwish", "Meadows of Heaven");
	contestInfo[27] = new entryInfo("Swelatie",2, "Swelatie", "Renan Luce", "La Lettre");
	contestInfo[28] = new entryInfo("Symphony Isles",5, "Symphony Isles", "Mumford & Sons", "Broken Crown");
	contestInfo[29] = new entryInfo("Tashkveny",3, "Tashkveny", "Mànran", "Oran na Cloiche");
	contestInfo[30] = new entryInfo("Territrius",1, "Territrius", "Hooverphonic", "Vinegar & Salt");
	contestInfo[31] = new entryInfo("Tikata",1, "Tikata", "Ewa Farna", "Ewakuacja");
	contestInfo[32] = new entryInfo("Tonallán",2, "Tonallan", "Jesse & Joy", "¿Con quién se queda el perro?");
	contestInfo[33] = new entryInfo("Volnytaria",5, "Volnytaria", "Rob Thomas", "Diamonds");
	contestInfo[34] = new entryInfo("Yazminia",2, "Yazminia", "Rozalla", "Are You Ready to Fly?");
	
	host = 28;
    }
    private void ISC9()
    {
	contestInfo[0] = new entryInfo("Alexandria",3, "Alexandria", "Natalie Imbruglia", "That Day");
	contestInfo[1] = new entryInfo("Anselmsuusonia",3, "Anselmsuusonia", "Patricia Kaas", "Mon mec à moi");
	contestInfo[2] = new entryInfo("Bitland",1, "Bitland", "Nerina Pallot", "Sophia");
	contestInfo[3] = new entryInfo("Canedonia",3, "Canedonia", "Cesaria Evora", "Africa Nossa");
	contestInfo[4] = new entryInfo("Carpathia",4, "Carpathia", "Natasha Morozova", "Prince Igor");
	contestInfo[5] = new entryInfo("Chruno",5, "Chruno", "Mylène Farmer", "Lonely Lisa");
	contestInfo[6] = new entryInfo("DimkaRUS",4, "DimkaRUS", "Adele", "Set Fire to the Rain");
	contestInfo[7] = new entryInfo("Dinokratys & Shrikidai",2, "Dinokratys & Shrikidai", "Gossip", "Move in the Right Direction");
	contestInfo[8] = new entryInfo("DPR Jindalea",3, "DPR Jindalea", "A Lu A Zhuo", "Beautiful China");
	contestInfo[9] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Des'ree", "You Gotta Be");
	contestInfo[10] = new entryInfo("Edoriada",4, "Edoriada", "Jessie J", "Domino");
	contestInfo[11] = new entryInfo("Grolskira",4, "Grolskira", "Kelly Clarkson", "Stronger (What Doesn't Kill You)");
	contestInfo[12] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "strajker", "nnf nnf nnf");
	contestInfo[13] = new entryInfo("Harlequenia",2, "Harlequenia", "Genesis", "Home By the Sea");
	contestInfo[14] = new entryInfo("Irdminia",2, "Irdminia", "Archive", "Bullets");
	contestInfo[15] = new entryInfo("Keohretcha",2, "Keohretcha", "Black Lace", "Agadoo");
	contestInfo[16] = new entryInfo("Kosma",4, "Kosma", "Yuridia", "Enamorada y herida");
	contestInfo[17] = new entryInfo("Kwonia",3, "Kwonia", "T-ara", "Sexy Love");
	contestInfo[18] = new entryInfo("Lacrea",1, "Lacrea", "Marlango", "It's Alright");
	contestInfo[19] = new entryInfo("Lost Islands",1, "Lost Islands", "Amberian Dawn", "He Sleeps in a Grove");
	contestInfo[20] = new entryInfo("Luzze",2, "Luzze", "Saara Aalto", "Minne menee mistä tulee");
	contestInfo[21] = new entryInfo("Marvelia",5, "Marvelia", "Two Steps From Hell", "Archangel");
	contestInfo[22] = new entryInfo("Mukaltin",5, "Mukaltin", "Niki & The Dove", "Tomorrow");
	contestInfo[23] = new entryInfo("Nicolas' Neighbour",2, "Nicolas' Neighbour", "CHVRCHES", "The Mother We Share");
	contestInfo[24] = new entryInfo("Novatlantida",3, "Novatlantida", "Silence 4", "To Give");
	contestInfo[25] = new entryInfo("Oalia",4, "Oalia", "KARA", "Pandora");
	contestInfo[26] = new entryInfo("Pebbleland",1, "Pebbleland", "dEUS", "Little Arithmetics");
	contestInfo[27] = new entryInfo("Puntíkov",4, "Puntíkov", "Example", "Perfect Replacement");
	contestInfo[28] = new entryInfo("Rötenrod",4, "Rötenrod", "Muse", "Starlight");
	contestInfo[29] = new entryInfo("Saint Eva & Lepland",5, "Saint Eva & Lepland", "Yohanna", "Worryfish");
	contestInfo[30] = new entryInfo("San Monique",5, "San Monique", "Ronya", "Annoying");
	contestInfo[31] = new entryInfo("San Remo",2, "San Remo", "Daddy Yankee", "Lovumba");
	contestInfo[32] = new entryInfo("Sibinia",2, "Sibinia", "Armin van Buuren ft. Sharon den Adel", "In and Out of Love");
	contestInfo[33] = new entryInfo("Sockistan",1, "Sockistan", "Super Mama Djombo", "Dissan na m'bera");
	contestInfo[34] = new entryInfo("Spirevo",5, "Spirevo", "Nadine", "Made Up My Mind");
	contestInfo[35] = new entryInfo("Sunetti",5, "Sunetti", "Röyksopp ft. Susanne Sundfør", "Running to the Sea");
	contestInfo[36] = new entryInfo("Symphony Isles",3, "Symphony Isles", "Rachel Platten", "1000 Ships");
	contestInfo[37] = new entryInfo("Territrius",1, "Territrius", "Zbigniew Preisner", "Lacrimosa");
	contestInfo[38] = new entryInfo("Thorway",3, "Thorway", "Friðrik Dór", "Nóttin svört");
	contestInfo[39] = new entryInfo("Tikata",2, "Tikata", "E.S. Posthumus", "Nara");
	contestInfo[40] = new entryInfo("Tonallán",5, "Tonallán", "Federico Aubele", "La esquina");
	contestInfo[41] = new entryInfo("Volnytaria",2, "Volnytaria", "Taylor Swift", "Picture to Burn");
	contestInfo[42] = new entryInfo("Yazminia",1, "Yazminia", "Sameba", "Gelino");


    }
    private void ISC38()
    {
	contestInfo[0] = new entryInfo("Alma Livre",1, "Alma Livre", "Future Folk", "Odjechałaś Moja Miła");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Christina Skaar", "Critical");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Cheraze", "Promets pas la lune");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Lawson", "Learn To Love Again");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Molly Sandén", "Like No One's Watching");
	contestInfo[5] = new entryInfo("Bubblique",5, "Bubblique", "Pauline", "Allo Le Monde");
	contestInfo[6] = new entryInfo("Caprika",2, "Caprika", "Kate Covington", "Itsumo Nando Demo");
	contestInfo[7] = new entryInfo("Chruno",5, "Chruno", "Say Lou Lou", "Everything We Touch");
	contestInfo[8] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Jessica Mauboy", "Never Be The Same");
	contestInfo[9] = new entryInfo("Edoriada",4, "Edoriada", "Nuša Derenda", "V ogenj zdaj obleci me");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Haoussa", "Magrebhi Hoor");
	contestInfo[11] = new entryInfo("Evergreen Lands",1, "Evergreen Lands", "Laura Doggett feat. Alice Jemima", "Night Girl");
	contestInfo[12] = new entryInfo("Gebze",3, "Gebze", "Rojin", "Xorte Lori");
	contestInfo[13] = new entryInfo("Grolskira",4, "Grolskira", "Io Carlo", "L'ego");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",1, "HKJIADH", "Las Balkanieras", "Fatima (Miss Fatty Balkan Cover)");
	contestInfo[15] = new entryInfo("Hanzyuki",3, "Hanzyuki", "Ezra Vine", "Celeste");
	contestInfo[16] = new entryInfo("Hattuka",1, "Hattuka", "KHERAU", "Isiltasun Ituna");
	contestInfo[17] = new entryInfo("Haven",5, "Haven", "Andrea", "Nay-dobrata");
	contestInfo[18] = new entryInfo("Huania",4, "Huania", "Johanna Kurkela", "Ei Panikoida");
	contestInfo[19] = new entryInfo("Irdminia",2, "Irdminia", "M83 feat. HAIM", "Holes in the Sky");
	contestInfo[20] = new entryInfo("Kaeros Islands",5, "Kaeros Islands", "Cosmo Sheldrake", "Tardigrade Song");
	contestInfo[21] = new entryInfo("Kaledonii",4, "Kaledonii", "M. Pokora", "Le Jour Qui Se Rêve");
	contestInfo[22] = new entryInfo("Kaministiquia",5, "Kaministiquia", "GJan", "Not Afraid");
	contestInfo[23] = new entryInfo("Keohretcha",2, "Keohretcha", "Almina", "So ist das Spiel so ist das Leben");
	contestInfo[24] = new entryInfo("Kosma",2, "Kosma", "Anna Puu", "Säännöt rakkaudelle");
	contestInfo[25] = new entryInfo("Lacrea",1, "Lacrea", "Michael Shulte", "Thoughts");
	contestInfo[26] = new entryInfo("Laranjeiras",3, "Laranjeiras", "Shoshana Bean", "Gin and Cigarettes");
	contestInfo[27] = new entryInfo("Leshia",4, "Leshia", "Tamar Kaprelian ft. Elina Born Elhaida Dani Maria-Elena Kyriakou & Stephanie Topalian", "The Otherside");
	contestInfo[28] = new entryInfo("Lettuce",3, "Lettuce", "Nneka", "Heartbeat");
	contestInfo[29] = new entryInfo("Lost Islands",2, "Lost Islands", "The Soil Bleeds Black", "Away");
	contestInfo[30] = new entryInfo("Luzze",2, "Luzze", "Nina Kraljić", "Zaljuljali Smo Svijet");
	contestInfo[31] = new entryInfo("Mensa",1, "Mensa", "Yonderboi", "All We Go To Hell");
	contestInfo[32] = new entryInfo("Monteverde",5, "Monteverde", "William Kingswood", "When Night Falls");
	contestInfo[33] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Florence + The Machine", "Queen of Peace");
	contestInfo[34] = new entryInfo("Noxus",3, "Noxus", "X Ambassadors", "Renegades");
	contestInfo[35] = new entryInfo("Ova Anova",3, "Ova Anova", "Susanne Sundfør", "Delirious");
	contestInfo[36] = new entryInfo("Pebbleland",1, "Pebbleland", "Gabrielle", "Mellom Skyene");
	contestInfo[37] = new entryInfo("Pen Island",5, "Pen Island", "Leona Lewis", "I Am");
	contestInfo[38] = new entryInfo("Porielana",3, "Porielana", "of Verona", "Castles");
	contestInfo[39] = new entryInfo("Rata Sum",3, "Rata Sum", "4Minute", "Muzik");
	contestInfo[40] = new entryInfo("Ruthsina",3, "Ruthsina", "Sia", "Elastic Heart");
	contestInfo[41] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Vienna Teng", "Level Up");
	contestInfo[42] = new entryInfo("Sanlyona",4, "Sanlyona", "Sakurakko Club", "Sailor War");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Lindsay McCaul", "Say My Name");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "Anastasia Vinnikova", "Born in Belorussia");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "Junior Senior", "Move Your Feet");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "The National Fanfare of Kadebostany", "Walking With a Ghost");
	contestInfo[47] = new entryInfo("Tikata",4, "Tikata", "Rufus Wainwright", "Do I disappoint you");
	contestInfo[48] = new entryInfo("Tjärsklanjska",1, "Tjärsklanjska", "Maisey Rika", "Pūmau Tonu");
	contestInfo[49] = new entryInfo("Tonállan",2, "Tonallan", "Café Tacvba", "Olita Del Altamar");
	contestInfo[50] = new entryInfo("Valdron",1, "Valdron", "Angèle Dubeau & La Pietà", "Experience");
	contestInfo[51] = new entryInfo("Yazminia",2, "Yazminia", "Pedrina y Rio", "Enamorada");
	contestInfo[52] = new entryInfo("Zeme Kuku",2, "Zeme Kuku", "Mika", "Promiseland");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Victoria Justice", "Gold");
	
	host = 1;
    }
    private void ISC39()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Marina Maximilian Blumin", "Silence");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "The Calling", "Wherever You Will Go");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Lashyn", "Zhasa tugan zherim");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Amel Bent", "Délit");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Beau", "One Wing");
	contestInfo[5] = new entryInfo("Bubblique",5, "Bubblique", "Kylie Minogue", "Too Far");
	contestInfo[6] = new entryInfo("Caprika",2, "Caprika", "Natasha Marsh", "I Won't Light a Candle");
	contestInfo[7] = new entryInfo("Chruno",5, "Chruno", "Fefe Dobson", "Stuttering");
	contestInfo[8] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Toy-Box", "Tarzan & Jane");
	contestInfo[9] = new entryInfo("Dvinpantara",3, "Dvinpantara", "Anna Maria Zimmerman", "Nur Noch Einmal Schlafen");
	contestInfo[10] = new entryInfo("Edoriada",4, "Edoriada", "Elena Paparizou", "Soma Kai Psihi");
	contestInfo[11] = new entryInfo("Eriod",1, "Eriod", "Dorothy", "Wicked Ones");
	contestInfo[12] = new entryInfo("Evergreen Lands",1, "Evergreen Lands", "Pierre Kwenders feat. Jacobus", "Mardi Gras");
	contestInfo[13] = new entryInfo("Gebze",5, "Gebze", "Rojda", "Le Buke");
	contestInfo[14] = new entryInfo("Grolskira",4, "Grolskira", "Kwabs", "Walk");
	contestInfo[15] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Nihola", "Hush kelibsiz O'zbekistonga");
	contestInfo[16] = new entryInfo("Hanzyuki",3, "Hanzyuki", "Lenka", "Two");
	contestInfo[17] = new entryInfo("Hattuka",1, "Hattuka", "Dirty Shirt", "Balkanique");
	contestInfo[18] = new entryInfo("Haven",5, "Haven", "Alex Nevsky", "Fanny");
	contestInfo[19] = new entryInfo("Huania",4, "Huania", "Leon Somov & Jazzu", "Gana");
	contestInfo[20] = new entryInfo("Irdminia",2, "Irdminia", "Niyaz", "Mazaar");
	contestInfo[21] = new entryInfo("Kaeros Islands",5, "Kaeros Islands", "Alexa Goddard", "We Broke the Sky");
	contestInfo[22] = new entryInfo("Kaledonii",4, "Kaledonii", "Within Temptation ft. Piotr Rogucki", "Whole World Is Watching");
	contestInfo[23] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Tori Kelly", "Should Have Been Us");
	contestInfo[24] = new entryInfo("Keohretcha",2, "Keohretcha", "Henrik Dorsin", "Tingaliin (Russian Base - Lovers Remix)");
	contestInfo[25] = new entryInfo("Kosma",2, "Kosma", "Chisu", "Ihana");
	contestInfo[26] = new entryInfo("Lacrea",1, "Lacrea", "Robyn Sherwell", "Islander");
	contestInfo[27] = new entryInfo("Laranjeiras",3, "Laranjeiras", "Two Door Cinema Club", "What You Know");
	contestInfo[28] = new entryInfo("Leshia",4, "Leshia", "Bellefire", "Say Something Anyway");
	contestInfo[29] = new entryInfo("Lettuce",3, "Lettuce", "MIN", "Stuck");
	contestInfo[30] = new entryInfo("Luzze",1, "Luzze", "Nik Ammar", "Glass Walls");
	contestInfo[31] = new entryInfo("Mensa",1, "Mensa", "Débruit", "Mega Wagna");
	contestInfo[32] = new entryInfo("Monteverde",5, "Monteverde", "Critical Mass", "Prophecy of Divine Judgement");
	contestInfo[33] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Deborah Iurato", "Da Sola");
	contestInfo[34] = new entryInfo("Noxus",3, "Noxus", "Jess Glynne", "Don't Be So Hard on Yourself");
	contestInfo[35] = new entryInfo("Ova Anova",3, "Ova Anova", "Paola & Chiara", "Vamos a bailar (Esta vida nueva)");
	contestInfo[36] = new entryInfo("Pebbleland",1, "Pebbleland", "Luc Arbogast", "Vox Clamantis");
	contestInfo[37] = new entryInfo("Pen Island",5, "Pen Island", "Atiye", "Bring Me Back");
	contestInfo[38] = new entryInfo("Ponásikwa",1, "Ponasikwa", "Wolfgun", "The Woods");
	contestInfo[39] = new entryInfo("Porielana",3, "Porielana", "Eliane", "Venus & Mars");
	contestInfo[40] = new entryInfo("Rata Sum",3, "Rata Sum", "Kan Mi Youn feat. Eric", "Paparazzi");
	contestInfo[41] = new entryInfo("Ruthsina",3, "Ruthsina", "Made In Heights", "Murakami");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Lys Assia feat. NewJack", "All In Your Head");
	contestInfo[43] = new entryInfo("Sanlyona",4, "Sanlyona", "Alessandra Amoroso", "Amore puro");
	contestInfo[44] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Michelle", "Herzstillstand");
	contestInfo[45] = new entryInfo("Sunetti",5, "Sunetti", "Ingrid Michaelson", "Time Machine");
	contestInfo[46] = new entryInfo("Tashkveny",3, "Tashkveny", "Karen Harding", "Say Something");
	contestInfo[47] = new entryInfo("Territrius",1, "Territrius", "Evelyn Evelyn", "Evelyn Evelyn");
	contestInfo[48] = new entryInfo("Tikata",2, "Tikata", "Hurts", "Somebody to Die For");
	contestInfo[49] = new entryInfo("Tjärsklanjska",1, "Tjärsklanjska", "Bertine Zetlitz feat. Samsaya", "Electric Feet");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Travis", "Side");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Narsilion", "Montserrat");
	contestInfo[52] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Çıtır Kızlar", "Çıtır Kızlar");
	contestInfo[53] = new entryInfo("Zeme Kuku",2, "Zeme Kuku", "Michael Patrick Kelly", "Shake Away");
	contestInfo[54] = new entryInfo("Zephyrus",3, "Zephyrus", "Little Mix", "Black Magic");
	
	host = 1;
    }
    private void ISC40()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Johanna Iivanainen", "Joutsenlaulu");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Sam Tsui & Kina Grannis", "Bring Me The Night");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Bebe Rexha", "I'm Gonna Show You Crazy");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Dominika Mirgova", "Tu sme boli");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Halsey", "Colors");
	contestInfo[5] = new entryInfo("Bubblique",5, "Bubblique", "Laïs", "De Wereld Vergaat");
	contestInfo[6] = new entryInfo("Caprika",2, "Caprika", "Hu Yang Lin", "Toxic Perfume");
	contestInfo[7] = new entryInfo("Chruno",5, "Chruno", "Joanna Noëlle Blagden Levesque (JoJo)", "Save My Soul");
	contestInfo[8] = new entryInfo("Dulcet Ebullience",2, "Dulcet Ebullience", "Do As Infinity", "Fukai Mori");
	contestInfo[9] = new entryInfo("Dvinpantara",3, "Dvinpantara", "Vance Joy", "Fire and The Flood");
	contestInfo[10] = new entryInfo("Edoriada",4, "Edoriada", "Sunidhi Chauhan", "Aaja Nachle");
	contestInfo[11] = new entryInfo("Eriod",1, "Eriod", "We Singing Colors", "Good Days, Bad Days");
	contestInfo[12] = new entryInfo("Evergreen Lands",1, "Evergreen Lands", "Johnny Rain", "Jericho");
	contestInfo[13] = new entryInfo("Gebze",5, "Gebze", "Lana Del Rey", "High By the Beach");
	contestInfo[14] = new entryInfo("Grolskira",4, "Grolskira", "Megan", "Sous ma peau");
	contestInfo[15] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Alida", "When I Die");
	contestInfo[16] = new entryInfo("Hanzyuki",3, "Hanzyuki", "Lily Allen", "Not Fair");
	contestInfo[17] = new entryInfo("Hattuka",1, "Hattuka", "Foals", "Mountain At My Gates");
	contestInfo[18] = new entryInfo("Haven",5, "Haven", "Molly Pettersson Hammar", "Something Right");
	contestInfo[19] = new entryInfo("Huania",4, "Huania", "Union J", "You Got It All");
	contestInfo[20] = new entryInfo("Irdminia",2, "Irdminia", "Margaret Berger", "Scream");
	contestInfo[21] = new entryInfo("Kaeros Islands",5, "Kaeros Islands", "Charlotte OC", "On & On");
	contestInfo[22] = new entryInfo("Kaledonii",4, "Kaledonii", "Lata Mangeshkar", "Chalte Chalte");
	contestInfo[23] = new entryInfo("Kaministiquia",5, "Kaministiquia", "machineheart", "Watercolors");
	contestInfo[24] = new entryInfo("Keohretcha",2, "Keohretcha", "Glósóli", "Breaking the Silence");
	contestInfo[25] = new entryInfo("Kosma",2, "Kosma", "Ariane Moffatt", "Mon corps");
	contestInfo[26] = new entryInfo("Lacrea",1, "Lacrea", "Emile Haynie feat. Charlotte Gainsbourg, Devonté Hynes & Sampha", "A Kiss Goodbye");
	contestInfo[27] = new entryInfo("Laranjeiras",3, "Laranjeiras", "Queen", "Who Wants to Live Forever");
	contestInfo[28] = new entryInfo("Leshia",4, "Leshia", "Sabi", "Wild Heart");
	contestInfo[29] = new entryInfo("Lettuce",3, "Lettuce", "Colibritany", "Mi Sexy Chambelán");
	contestInfo[30] = new entryInfo("Luzze",1, "Luzze", "Korkeintotuus", "Mörkö");
	contestInfo[31] = new entryInfo("Mensa",1, "Mensa", "Elifantree", "Confused");
	contestInfo[32] = new entryInfo("Monteverde",5, "Monteverde", "Purity Ring", "Begin Again");
	contestInfo[33] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Delta Rae", "Chasing Twisters");
	contestInfo[34] = new entryInfo("Noxus",3, "Noxus", "Serebro", "Ya Tebya Ne Otdam");
	contestInfo[35] = new entryInfo("Ova Anova",3, "Ova Anova", "Margaret", "Heartbeat");
	contestInfo[36] = new entryInfo("Pebbleland",1, "Pebbleland", "The Weeknd", "The Hills");
	contestInfo[37] = new entryInfo("Pen Island",5, "Pen Island", "Marina Kaye", "Dancing With The Devil");
	contestInfo[38] = new entryInfo("Ponásikwa",1, "Ponasikwa", "Mihaela Marinova", "Stapka napred");
	contestInfo[39] = new entryInfo("Porielana",3, "Porielana", "Namika", "Lieblingsmensch");
	contestInfo[40] = new entryInfo("Rata Sum",3, "Rata Sum", "BoA", "COPY&PASTE");
	contestInfo[41] = new entryInfo("Ruthsina",3, "Ruthsina", "Guard", "He Tu");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Donna Lewis & Richard Marx", "At the Beginning");
	contestInfo[43] = new entryInfo("Sanlyona",4, "Sanlyona", "Metric", "Eclipse (All Yours)");
	contestInfo[44] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Mylène Farmer", "Sans Contrefaçon");
	contestInfo[45] = new entryInfo("Sunetti",5, "Sunetti", "The Veronicas", "Untouched");
	contestInfo[46] = new entryInfo("Tashkveny",3, "Tashkveny", "Ayse Hatun Önal", "Çak Bir Selam (Gurcell Style Mix)");
	contestInfo[47] = new entryInfo("Territrius",1, "Territrius", "Natalie Imbruglia", "Instant Crush");
	contestInfo[48] = new entryInfo("Tikata",2, "Tikata", "Emji", "Lost");
	contestInfo[49] = new entryInfo("Tjärsklanjska",1, "Tjärsklanjska", "Saint Saviour", "Bang");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Gin Wigmore", "Hey Ho");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Rebekka Karijord", "The Noble Art of Letting Go");
	contestInfo[52] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Mezdeke", "Alabina Yallah");
	contestInfo[53] = new entryInfo("Zeme Kuku",2, "Zeme Kuku", "JORIS", "Herz über Kopf");
	contestInfo[54] = new entryInfo("Zephyrus",3, "Zephyrus", "Paramore feat. Joy Williams", "Hate To See Your Heart Break");
	
	host = 8;
	
    }
    private void ISC41()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "MNDR", "Kimono");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Tove Styrke", "Borderline");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "The Sam Willows", "Take Heart");
	contestInfo[3] = new entryInfo("Auspikitan",5, "Auspikitan", "Red", "Pieces");
	contestInfo[4] = new entryInfo("Bitland",1, "Bitland", "Rymdreglage", "Respawn");
	contestInfo[5] = new entryInfo("Bubblique",5, "Bubblique", "María Isabel", "La vida sólo es una");
	contestInfo[6] = new entryInfo("Caprika",2, "Caprika", "He Jingxin", "Lemon Tree");
	contestInfo[7] = new entryInfo("Chruno",5, "Chruno", "Cilia", "Silhouettes in Slow Motion");
	contestInfo[8] = new entryInfo("Dvinpantara",3, "Dvinpantara", "Pinup Girls", "Pajudėk");
	contestInfo[9] = new entryInfo("Edoriada",4, "Edoriada", "Anastacia", "Lifeline");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Solander", "The Woods Are Gone");
	contestInfo[11] = new entryInfo("Gandhara",2, "Gandhara", "Emin", "Amor");
	contestInfo[12] = new entryInfo("Gebze",5, "Gebze", "Petra Marklund", "Som du bäddar");
	contestInfo[13] = new entryInfo("Grolskira",4, "Grolskira", "IAMX", "I Come with Knives");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",4, "HKJIADH", "Tay Allyn ft. Sunnycide", "What's Your Sign?");
	contestInfo[15] = new entryInfo("Hanzyuki",3, "Hanzyuki", "Amanda Mair", "Sense");
	contestInfo[16] = new entryInfo("Hattuka",1, "Hattuka", "Enter Shikari", "Sorry You're Not a Winner");
	contestInfo[17] = new entryInfo("Haven",5, "Haven", "Hailee Steinfeld", "Love Myself");
	contestInfo[18] = new entryInfo("Huania",4, "Huania", "Irma Jurgelevičiūtė", "Žalių bangų vynas");
	contestInfo[19] = new entryInfo("Irdminia",2, "Irdminia", "Black M", "On s'fait du mal");
	contestInfo[20] = new entryInfo("Kaeros Islands",5, "Kaeros Islands", "Egor Krid", "Samaya Samaya");
	contestInfo[21] = new entryInfo("Kaledonii",4, "Kaledonii", "Annalisa", "Splende");
	contestInfo[22] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Charlie", "Ghosts");
	contestInfo[23] = new entryInfo("Keohretcha",2, "Keohretcha", "Oesch's die Dritten", "Jodel-Time");
	contestInfo[24] = new entryInfo("Kosma",2, "Kosma", "Les Cowboys Fringants", "Bye Bye Lou");
	contestInfo[25] = new entryInfo("Lacrea",1, "Lacrea", "Rob Cantor", "All I Need Is You");
	contestInfo[26] = new entryInfo("Laranjeiras",3, "Laranjeiras", "My Chemical Romance", "Welcome to the Black Parade");
	contestInfo[27] = new entryInfo("Leshia",4, "Leshia", "Tolvai Renáta", "Hagylak menni");
	contestInfo[28] = new entryInfo("Luzze",1, "Luzze", "Mariska", "Sotilaat");
	contestInfo[29] = new entryInfo("Mensa",1, "Mensa", "Lucrecia Dalt", "Esotro");
	contestInfo[30] = new entryInfo("Monteverde",5, "Monteverde", "Austra", "Lose It");
	contestInfo[31] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "CHVRCHES", "Leave a Trace");
	contestInfo[32] = new entryInfo("Noxus",3, "Noxus", "Adele", "Hello");
	contestInfo[33] = new entryInfo("Ova Anova",3, "Ova Anova", "Sweet Brains", "Run Away");
	contestInfo[34] = new entryInfo("Pebbleland",1, "Pebbleland", "Choir of Young Believers", "Hollow Talk");
	contestInfo[35] = new entryInfo("Pen Island",5, "Pen Island", "Shura", "White Light");
	contestInfo[36] = new entryInfo("Ponásikwa",1, "Ponasikwa", "Madeon", "Finale");
	contestInfo[37] = new entryInfo("Porielana",3, "Porielana", "The Common Linnets", "We Don't Make the Wind Blow");
	contestInfo[38] = new entryInfo("Rata Sum",3, "Rata Sum", "RaNia", "Dr. Feel Good");
	contestInfo[39] = new entryInfo("Ruthsina",3, "Ruthsina", "Han Hong", "Wild Goose Flying to the South");
	contestInfo[40] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Rococode", "Empire");
	contestInfo[41] = new entryInfo("Sanlyona",4, "Sanlyona", "Foxes", "Body Talk");
	contestInfo[42] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Ester Dean", "Crazy Youngsters");
	contestInfo[43] = new entryInfo("Sunetti",5, "Sunetti", "Reigan", "Feels Like Heaven");
	contestInfo[44] = new entryInfo("Tashkveny",3, "Tashkveny", "Na Seòid", "Mo Chailin Dìleas Donn");
	contestInfo[45] = new entryInfo("Territrius",1, "Territrius", "Hiba Tawaji", "Metl el chajar mazrou3in");
	contestInfo[46] = new entryInfo("Thorway",3, "Thorway", "Christopher", "Tulips");
	contestInfo[47] = new entryInfo("Tikata",2, "Tikata", "Labrinth ft. Emeli Sandé", "Beneath Your Beautiful");
	contestInfo[48] = new entryInfo("Tjärsklanjska",1, "Tjärsklanjska", "Kaija Saariaho", "Lonh");
	contestInfo[49] = new entryInfo("Tonállan",2, "Tonallan", "Melody Gardot", "Preacherman");
	contestInfo[50] = new entryInfo("Valdron",1, "Valdron", "Emma Shapplin", "L'absolu");
	contestInfo[51] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Marina and the Diamonds", "Lies");
	contestInfo[52] = new entryInfo("Zeme Kuku",2, "Zeme Kuku", "Ben Folds", "Phone in a Pool");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Vengaboys", "Boom, Boom, Boom, Boom!!");
	
	host = 13;
    }
    private void ISC42()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Rural Zombies", "Stones");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Birdy & Rhodes", "Let It All Go");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Laurie Darmon", "Rupture");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Louane", "Nos Secrets");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Against the Current", "Outsiders");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "Snowbird", "Porcelain");
	contestInfo[6] = new entryInfo("Bubblique",4, "Bubblique", "K3", "10.000 Luchtballonnen");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Jennifer Paige", "Crush");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Samantha Jade", "Born To Be Alive");
	contestInfo[9] = new entryInfo("Dvinpantara",3, "Dvinpantara", "Polina Gagarina", "Spectakl' Okonchen");
	contestInfo[10] = new entryInfo("Edoriada",4, "Edoriada", "Jess Glynne", "Hold My Hand");
	contestInfo[11] = new entryInfo("Eriod",1, "Eriod", "Patch & The Giant", "God Rest Ye Merry Gentlemen");
	contestInfo[12] = new entryInfo("Fierce",4, "Fierce", "Javiera Mena", "Espada");
	contestInfo[13] = new entryInfo("Gandhara",3, "Gandhara", "Dima Bilan & Nikki Jamal", "Come Into My World");
	contestInfo[14] = new entryInfo("Gebze",5, "Gebze", "Foxes", "Youth");
	contestInfo[15] = new entryInfo("Grolskira",2, "Grolskira", "OneRepublic", "Stop And Stare");
	contestInfo[16] = new entryInfo("H Kim Jong Il's AD Hangug",2, "HKJIADH", "Xinhua News", "Pay Attention To The 十三五 (Shi San Wu)");
	contestInfo[17] = new entryInfo("Hanzyuki",1, "Hanzyuki", "Stefanie Heinzmann", "On Fire");
	contestInfo[18] = new entryInfo("Hattuka",5, "Hattuka", "Sleeping at Last", "Saturn");
	contestInfo[19] = new entryInfo("Haven",3, "Haven", "Ariana Grande", "Focus");
	contestInfo[20] = new entryInfo("Huania",3, "Huania", "Johanna Kurkela", "Ingrid");
	contestInfo[21] = new entryInfo("Irdminia",3, "Irdminia", "Digital Daggers", "Still Here");
	contestInfo[22] = new entryInfo("Kaeros Islands",5, "Kaeros Islands", "Sabrina Starke feat. Ziggi Recado", "Backseat Driver");
	contestInfo[23] = new entryInfo("Kaledonii",4, "Kaledonii", "Kátya Tompos", "Magányos Csónak");
	contestInfo[24] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Halsey", "Ghost");
	contestInfo[25] = new entryInfo("Keohretcha",2, "Keohretcha", "", "De Zak Van Sinterklaas");
	contestInfo[26] = new entryInfo("Kosma",2, "Kosma", "Frillan & Prillan", "Vi Skall Inte Dö Idag");
	contestInfo[27] = new entryInfo("Lacrea",1, "Lacrea", "Zazie", "Un Point C'est Toi");
	contestInfo[28] = new entryInfo("Laranjeiras",4, "Laranjeiras", "Anouk", "For Bitter Or Worse");
	contestInfo[29] = new entryInfo("Leshia",5, "Leshia", "Emma Marrone", "Arriverà L’amore");
	contestInfo[30] = new entryInfo("Luzze",1, "Luzze", "Vesala", "Tequila");
	contestInfo[31] = new entryInfo("Mensa",1, "Mensa", "Xanopticon", "Neurve");
	contestInfo[32] = new entryInfo("Monteverde",5, "Monteverde", "Marcelina", "Znikam");
	contestInfo[33] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "The Piano Guys", "Beethoven's 5 Secrets");
	contestInfo[34] = new entryInfo("Noxus",3, "Noxus", "Lazyboy Empire", "Vampire");
	contestInfo[35] = new entryInfo("Ova Anova",3, "Ova Anova", "Kristína", "Ta Ne");
	contestInfo[36] = new entryInfo("Pebbleland",1, "Pebbleland", "Gary Jules & Michael Andrews", "Mad World");
	contestInfo[37] = new entryInfo("Pen Island",4, "Pen Island", "Xhesika Polo", "Fati Nemi Je");
	contestInfo[38] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Sarah Riani", "Comme Toi");
	contestInfo[39] = new entryInfo("Pönö",1, "Ruthsina", "Olya Polyakova", "Russian Style (Ya Ne Takaya)");
	contestInfo[40] = new entryInfo("Porielana",4, "Porielana", "Narsha and Sunny Hill", "Mamma Mia");
	contestInfo[41] = new entryInfo("Rata Sum",3, "Rata Sum", "Jade Born", "Padmasambhava Mantra");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Liz Longley", "Rescue My Heart");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Maggie Lindemann", "Knocking On Your Love");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "Amber Run", "Noah");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "Ellen and the Escapades", "All The Crooked Scenes");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "Moddi", "Eli Geva");
	contestInfo[47] = new entryInfo("Thorway",3, "Thorway", "Veronica Maggio", "Måndagsbarn");
	contestInfo[48] = new entryInfo("Tikata",2, "Tikata", "Anna Wyszkoni[2]", "Biegnij Przed Siebie[2]");
	contestInfo[49] = new entryInfo("Tjärsklanjska",1, "Tjärsklanjska", "Essie Jain", "Raise You");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Hristina Soloviy", "Trimai");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Emel Mathlouthi", "Kelmti Horra");
	contestInfo[52] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Postmodern Jukebox ft. Morgan James", "Barbie Girl");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Celtic Woman ft. Oonagh", "Tír Na Nóg");

	
	host = 33;
    }
    private void ISC43()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "DAWA", "On The Run");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Ava Koci", "Come Home");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Cher Lloyd", "Sirens");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Gabriella Cilmi", "Sweet About Me");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Lucy Mason", "Seas of Grey");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "Hello Moth", "Clouds in Cloudless Skies");
	contestInfo[6] = new entryInfo("Bubblique",4, "Bubblique", "Linkin Park", "Burning In The Skies");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Eva Mendes", "The Windmills of your mind");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Laleh", "Colors");
	contestInfo[9] = new entryInfo("Edoriada",4, "Edoriada", "Kylie Minogue", "In My Arms");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "EDEN", "Wake Up");
	contestInfo[11] = new entryInfo("Fierce",4, "Fierce", "Amor Electro", "Rosa Sangue");
	contestInfo[12] = new entryInfo("Gandhara",3, "Gandhara", "Funda Arar", "Yoksun");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Kendji Girac", "Cool");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",2, "HKJIADH", "Star Wars", "Jar Jar's Introduction/The Swim to Otoh Gunga");
	contestInfo[15] = new entryInfo("Hanzyuki",1, "Hanzyuki", "Stéphanie Sandoz", "Flashback");
	contestInfo[16] = new entryInfo("Hattuka",5, "Hattuka", "Pegatina ft. Ska-P", "Una Mirada");
	contestInfo[17] = new entryInfo("Haven",3, "Haven", "JoJo", "Say Love");
	contestInfo[18] = new entryInfo("Huania",3, "Huania", "Stellar", "Marionette");
	contestInfo[19] = new entryInfo("Kaledonii",4, "Kaledonii", "Coldplay", "Everglow");
	contestInfo[20] = new entryInfo("Keohretcha",2, "Keohretcha", "Howard Goodall", "Alan 0 and Stephen hero");
	contestInfo[21] = new entryInfo("Kimmystan",5, "Kimmystan", "Evelina & Mikael Gabriel", "Honey");
	contestInfo[22] = new entryInfo("Kosma",2, "Kosma", "Ellinoora", "Carrie");
	contestInfo[23] = new entryInfo("Lacrea",1, "Lacrea", "Iris & Hedvig", "The Watcher and The Mind");
	contestInfo[24] = new entryInfo("Laranjeiras",4, "Laranjeiras", "You+Me", "No Ordinary Love");
	contestInfo[25] = new entryInfo("Leshia",5, "Leshia", "Billie", "Give Me The Knife");
	contestInfo[26] = new entryInfo("Luzze",1, "Luzze", "Bovska", "Kaktus");
	contestInfo[27] = new entryInfo("Mensa",1, "Mensa", "Bartholomäus Traubeck", "Fraxinus (Ash)");
	contestInfo[28] = new entryInfo("Monteverde",5, "Monteverde", "Karolina Czarnecka vs SoDrumatic", "Za Siedmioma Górami");
	contestInfo[29] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Lisa Nilsson & Joakim Berg", "Innan vi faller");
	contestInfo[30] = new entryInfo("Noxus",3, "Noxus", "Senny", "Supermen Balkanac");
	contestInfo[31] = new entryInfo("Ova Anova",3, "Ova Anova", "Zlata Ognevich", "Kruzheva");
	contestInfo[32] = new entryInfo("Pebbleland",1, "Pebbleland", "Kita Alexander", "My Own Way");
	contestInfo[33] = new entryInfo("Pen Island",4, "Pen Island", "Janne", "Meeting the Wolf");
	contestInfo[34] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Johanna Kurkela", "Kuolevainen");
	contestInfo[35] = new entryInfo("Pono",1, "Pono", "Ralph Schuckett & John Loeffler", "The Great Guardian (Lugia's Song)");
	contestInfo[36] = new entryInfo("Porielana",4, "Porielana", "Sleepthief feat. Phildel", "Dust & Cloud");
	contestInfo[37] = new entryInfo("Rata Sum",3, "Rata Sum", "Taemin feat. Kai", "Pretty Boy");
	contestInfo[38] = new entryInfo("Pönö",1, "Ruthsina", "Milk@Coffee", "Person in Memory");
	contestInfo[39] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Clare Maguire", "The Shield and the Sword");
	contestInfo[40] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Troye Sivan", "Youth");
	contestInfo[41] = new entryInfo("Sunetti",5, "Sunetti", "Seafret", "Atlantis");
	contestInfo[42] = new entryInfo("Tashkveny",3, "Tashkveny", "Lukas Graham", "7 Years");
	contestInfo[43] = new entryInfo("Territrius",1, "Territrius", "Sleeping at Last", "Light");
	contestInfo[44] = new entryInfo("Thorway",3, "Thorway", "Alina Devecerski", "Flytta På Dej");
	contestInfo[45] = new entryInfo("Tikata",2, "Tikata", "Bajofondo & Julieta Venegas", "Pa bailar");
	contestInfo[46] = new entryInfo("Timivar",5, "Timivar", "LAUV", "The Other");
	contestInfo[47] = new entryInfo("Tonállan",2, "Tonallan", "Hello Seahorse!", "Me He Convertido");
	contestInfo[48] = new entryInfo("Valdron",1, "Valdron", "Enya", "Isobella");
	contestInfo[49] = new entryInfo("Victoria",3, "Victoria", "Mika", "Elle Me Dit");
	contestInfo[50] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Demet Akalın", "Olacak Olacak");
	contestInfo[51] = new entryInfo("Zephyrus",3, "Zephyrus", "Samson & Gert", "In de disco");



	
	host = 30;
    }
    private void ISC44()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Dumblonde", "Dreamsicle");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Antonia", "Dream About My Face");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Maya", "Toli");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Gavin James", "Bitter Pill");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Ida LaFontaine", "Go Again");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "A Love Like Pi", "Wide Awake");
	contestInfo[6] = new entryInfo("Bubblique",4, "Bubblique", "Taylor Swift", "Out of the Woods");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Saara Aalto", "You Had My Heart");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Maja Francis", "Come Companion");
	contestInfo[9] = new entryInfo("Edoriada",4, "Edoriada", "Mando", "Dos Mou Logo Na Soth");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Merja Soria", "Aamulla Varhain");
	contestInfo[11] = new entryInfo("Fierce",4, "Fierce", "Loboda", "40 Gradusov");
	contestInfo[12] = new entryInfo("Gandhara",3, "Gandhara", "Angel Grant", "Lil' Red Boat");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Zella Day", "High");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "Jar Jar Binks", "How Rude");
	contestInfo[15] = new entryInfo("Hanzyuki",2, "Hanzyuki", "Within Temptation", "Shot in the Dark");
	contestInfo[16] = new entryInfo("Hattuka",1, "Hattuka", "Donkeyboy", "Lost");
	contestInfo[17] = new entryInfo("Haven",5, "Haven", "Vita Bandet ft. Niello", "Inga hinder");
	contestInfo[18] = new entryInfo("Huania",3, "Huania", "Theory of a Deadman", "Angel");
	contestInfo[19] = new entryInfo("Irdminia",3, "Irdminia", "Loreen", "Under Ytan");
	contestInfo[20] = new entryInfo("Kaledonii",4, "Kaledonii", "Darin", "Lagom");
	contestInfo[21] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Lea Rue", "Sleep");
	contestInfo[22] = new entryInfo("Keohretcha",2, "Keohretcha", "Elton John", "Circle of Life");
	contestInfo[23] = new entryInfo("Kimmystan",5, "Kimmystan", "Alan Walker", "Faded");
	contestInfo[24] = new entryInfo("Kosma",2, "Kosma", "Amanda Jenssen", "When We Dig For Gold in the USA");
	contestInfo[25] = new entryInfo("Lacrea",1, "Lacrea", "Eva & Manu", "Empty");
	contestInfo[26] = new entryInfo("Land of Jhe Freeh",2, "Land of Jhe Freeh", "Maria Hamer-Jensen", "Make You Stay");
	contestInfo[27] = new entryInfo("Laranjeiras",4, "Laranjeiras", "Mylène Farmer ft. Sting", "Stolen Car");
	contestInfo[28] = new entryInfo("Leshia",5, "Leshia", "Chairlift", "Moth to the Flame");
	contestInfo[29] = new entryInfo("Luzze",1, "Luzze", "David Bowie", "Space Oddity");
	contestInfo[30] = new entryInfo("Mensa",1, "Mensa", "Oki Dub Ainu Band", "Sakhalin Rock");
	contestInfo[31] = new entryInfo("Monteverde",5, "Monteverde", "Emma Louise", "Jungle");
	contestInfo[32] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Kate Boy", "Midnight Sun");
	contestInfo[33] = new entryInfo("Noxus",3, "Noxus", "League of Legends", "Demacia Rising");
	contestInfo[34] = new entryInfo("Ova Anova",3, "Ova Anova", "Kállay Saunders Band", "Victory");
	contestInfo[35] = new entryInfo("Pebbleland",1, "Pebbleland", "Eivør", "Morning Song");
	contestInfo[36] = new entryInfo("Pen Island",4, "Pen Island", "MORTEN ft. Frida Sundemo", "Beautiful Heartbeat");
	contestInfo[37] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Sindy", "S'envoler");
	contestInfo[38] = new entryInfo("Pönö",1, "Pono", "Anssi Kela", "Ikävä");
	contestInfo[39] = new entryInfo("Porielana",4, "Porielana", "Olga Romanovskaya", "Derzhi menya krepche");
	contestInfo[40] = new entryInfo("Rata Sum",3, "Rata Sum", "Hyoseong", "Good-Night Kiss");
	contestInfo[41] = new entryInfo("Ruthsina",1, "Ruthsina", "Yisa Yu", "Ask the Moonlight");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",2, "SEAL", "Bill Douglas & Ars Nova Singers", "The Cloud");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Beyoncé", "Halo");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "Ivan Torrent ft. Roger Berruezot", "Remember Me");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "Lim Kim", "Awoo");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "Nightwish", "Turn Loose the Mermaids");
	contestInfo[47] = new entryInfo("Thorway",3, "Thorway", "Guðrun Jacobsen", "Tú dregur meg sum ein magnetur");
	contestInfo[48] = new entryInfo("Tikata",2, "Tikata", "Milky Wishlake", "Wait For Us");
	contestInfo[49] = new entryInfo("Timivar",5, "Timivar", "EXGF", "We Are the Hearts");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Jaguares", "La vida no es igual");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Bat For Lashes", "The Haunted Man");
	contestInfo[52] = new entryInfo("Victoria",3, "Victoria", "Nielson & Miss Montreal", "Hoe");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Victoria Duffield", "Break My Heart");
	
	host = 29;
    }
    private void ISC45()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Fingertips", "Out of Control");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Stine Bramsen", "Karma Town");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Anitta", "Bang");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Birdy", "Keeping Your Head Up");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Coska", "Jupiter");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "Beacon", "IM U");
	contestInfo[6] = new entryInfo("Bubblique",5, "Bubblique", "Hooverphonic", "Amalfi");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Natasha Marsh", "Ai giochi addio");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Kerli", "Feral Hearts");
	contestInfo[9] = new entryInfo("Darkria",4, "Darkria", "Royal Blood", "Ten Tonne Skeleton");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Primal Scream & Sky Ferreira", "Where the Light Gets In");
	contestInfo[11] = new entryInfo("Fierce",2, "Fierce", "Hyphen Hyphen", "Just Need Your Love");
	contestInfo[12] = new entryInfo("Gandhara",3, "Gandhara", "Gülçin Ergül", "Bir Tanecik Aşkım");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Nicole Sabouné", "Lifetime");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "Alida", "Leave It All Behind");
	contestInfo[15] = new entryInfo("Hanzyuki",2, "Hanzyuki", "The Young Professionals ft. Anna F.", "All of It But Me");
	contestInfo[16] = new entryInfo("Haven",5, "Haven", "Otto Knows ft. Lindsey Stirling & Alex Aris", "Dying For You");
	contestInfo[17] = new entryInfo("Huania",2, "Huania", "Klemen Slakonja", "Putin, Putout");
	contestInfo[18] = new entryInfo("Irdminia",4, "Irdminia", "Kristina Maria", "FML x2");
	contestInfo[19] = new entryInfo("Kaledonii",4, "Kaledonii", "Josef Salvat", "Paradise (Les Paradis Nous Trouvera)");
	contestInfo[20] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Timoteij", "Het");
	contestInfo[21] = new entryInfo("Keohretcha",2, "Keohretcha", "Angie Bowie", "Pathetic Capitalist Whores");
	contestInfo[22] = new entryInfo("Kimmystan",3, "Kimmystan", "Micky Blue", "Wild Things");
	contestInfo[23] = new entryInfo("Kosma",2, "Kosma", "Anna Puu", "Kohta vapaita");
	contestInfo[24] = new entryInfo("Lacrea",1, "Lacrea", "Donna Burke", "Glassy Sky");
	contestInfo[25] = new entryInfo("Land of Jhe Freeh",4, "Land of Jhe Freeh", "Ledisi", "I Blame You");
	contestInfo[26] = new entryInfo("Laranjeiras",4, "Laranjeiras", "Fleur East", "Sax");
	contestInfo[27] = new entryInfo("Leshia",5, "Leshia", "Kaliopi", "Jutro");
	contestInfo[28] = new entryInfo("Luzze",1, "Luzze", "Lovisa Negga", "Mihá Ja Gievrra");
	contestInfo[29] = new entryInfo("Mensa",1, "Mensa", "Throbbing Gristle", "Hamburger Lady");
	contestInfo[30] = new entryInfo("Monteverde",1, "Monteverde", "Aneta", "We Could Be Lions");
	contestInfo[31] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Alda", "Heim");
	contestInfo[32] = new entryInfo("Noxus",3, "Noxus", "Son Lux", "Lost It to Trying");
	contestInfo[33] = new entryInfo("Ova Anova",3, "Ova Anova", "Kadie Elder", "First Time He Kissed a Boy");
	contestInfo[34] = new entryInfo("Pebbleland",1, "Pebbleland", "Khaled", "Aicha");
	contestInfo[35] = new entryInfo("Pen Island",5, "Pen Island", "Elliphant ft. Skrillex", "Spoon Me");
	contestInfo[36] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Natali", "Davaj so mnoj za zvyozdami");
	contestInfo[37] = new entryInfo("Pönö",3, "Pono", "ShadowBeatz", "Hypno's Lullaby");
	contestInfo[38] = new entryInfo("Porielana",3, "Porielana", "Charley Ann Schmutzler", "Blue Heart");
	contestInfo[39] = new entryInfo("Rata Sum",3, "Rata Sum", "BoA", "Lookbook");
	contestInfo[40] = new entryInfo("Ruthsina",1, "Ruthsina", "Ivyan", "Fight Against God");
	contestInfo[41] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Matt Dusk & Florence K", "Somethin' Stupid (Ces mots stupides)");
	contestInfo[42] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Baby K ft. Giusy Ferreri", "Roma - Bangkok");
	contestInfo[43] = new entryInfo("Sunetti",5, "Sunetti", "Lovebugs ft. Lene Marlin", "Avalon");
	contestInfo[44] = new entryInfo("Tashkveny",3, "Tashkveny", "Pixie Paris", "Ich lieb dich nicht immer");
	contestInfo[45] = new entryInfo("Territrius",1, "Territrius", "Ryder", "Ruins");
	contestInfo[46] = new entryInfo("Thorway",3, "Thorway", "Katharine McPhee", "Touch Me");
	contestInfo[47] = new entryInfo("Tikata",4, "Tikata", "Laura Pausini", "Simili");
	contestInfo[48] = new entryInfo("Timivar",5, "Timivar", "Flor", "Back Again");
	contestInfo[49] = new entryInfo("Tonállan",2, "Tonallan", "Porter", "Huitzil");
	contestInfo[50] = new entryInfo("Valdron",1, "Valdron", "Lambert", "Finally");
	contestInfo[51] = new entryInfo("Victoria",2, "Victoria", "Alexandra Stan", "I Did It, Mama!");
	contestInfo[52] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Demet Akalın", "Çalkala");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Ace of Base", "Beautiful Life");
	
	host = 27;
    }
    private void ISC46()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Livin' Joy", "Dreamer");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "MIIA", "Dynasty");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Grace Capristo", "One Woman Army");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "The 1975", "The Sound");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Angus & Julia Stone", "For You");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "Rei Kondoh", "Ōkamiden");
	contestInfo[6] = new entryInfo("Bubblique",5, "Bubblique", "Dua Lipa", "Be the One");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Kelly Clarkson", "Because of You");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Fallulah", "Out Of It");
	contestInfo[9] = new entryInfo("Darkria",4, "Darkria", "Soprano", "Clown");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Bride & Groom", "On The Run");
	contestInfo[11] = new entryInfo("Fierce",2, "Fierce", "Joan Miquel Oliver", "Flors de Cactus");
	contestInfo[12] = new entryInfo("Gandhara",3, "Gandhara", "Faia Younan", "Ohebbou Yadayka");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Emmy Curl", "Amory");
	contestInfo[14] = new entryInfo("Hanzyuki",2, "Hanzyuki", "Ivan Mládek", "Jožin z bažin");
	contestInfo[15] = new entryInfo("Háttuka",1, "Hattuka", "Ruen Brothers", "Summer Sun");
	contestInfo[16] = new entryInfo("Haven",5, "Haven", "Joywave", "Destruction");
	contestInfo[17] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "Oh Wonder", "Without You");
	contestInfo[18] = new entryInfo("Huania",2, "Huania", "Kamelot feat. Alissa White-Gluz", "Liar Liar");
	contestInfo[19] = new entryInfo("Kaledonii",4, "Kaledonii", "Ólafur Arnalds & Haukur Heiðar Hauksson", "A Hundred Reasons");
	contestInfo[20] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Kiiara", "Gold");
	contestInfo[21] = new entryInfo("Keohretcha",2, "Keohretcha", "Dalida", "Gigi L'amoroso");
	contestInfo[22] = new entryInfo("Kimmystan",3, "Kimmystan", "Vlaho", "Home");
	contestInfo[23] = new entryInfo("Kosma",2, "Kosma", "Natasha St-Pier", "Tous les Acadiens");
	contestInfo[24] = new entryInfo("Lacrea",1, "Lacrea", "Grace Mitchell", "Your Design");
	contestInfo[25] = new entryInfo("Land of Jhe Freeh",4, "Land of Jhe Freeh", "Marjan Farsad", "Khooneyed Maa");
	contestInfo[26] = new entryInfo("Laranjeiras",4, "Laranjeiras", "Albin feat. Kristin Amparo", "Vilken Jävla Smäll");
	contestInfo[27] = new entryInfo("Leshia",5, "Leshia", "Ministarke", "Boeing 747");
	contestInfo[28] = new entryInfo("Luzze",1, "Luzze", "Fiordmoss", "Madstone");
	contestInfo[29] = new entryInfo("Mensa",1, "Mensa", "The Knife", "We Share Our Mother's Health");
	contestInfo[30] = new entryInfo("Monteverde",1, "Monteverde", "EFF", "Stimme");
	contestInfo[31] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "St. Lucia", "Rescue Me");
	contestInfo[32] = new entryInfo("Noxus",3, "Noxus", "Sia", "Clap Your Hands");
	contestInfo[33] = new entryInfo("Ova Anova",3, "Ova Anova", "Don Woods", "How To Say Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch");
	contestInfo[34] = new entryInfo("Pebbleland",1, "Pebbleland", "Vera Blue", "Hold");
	contestInfo[35] = new entryInfo("Pen Island",5, "Pen Island", "Alex Vargas", "Shackled Up");
	contestInfo[36] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Vérité", "Strange Enough");
	contestInfo[37] = new entryInfo("Pönö",3, "Pono", "Psy vs. Takeo Ischi", "Gangnam Bibi Hendl Style");
	contestInfo[38] = new entryInfo("Porielana",3, "Porielana", "BanYa", "Beethoven Virus");
	contestInfo[39] = new entryInfo("Rata Sum",3, "Rata Sum", "Florrie", "Too Young To Remember");
	contestInfo[40] = new entryInfo("Republica Libera",4, "Republica Libera", "Cascada", "Because The Night");
	contestInfo[41] = new entryInfo("Ruthsina",1, "Ruthsina", "Adile Sidiq", "Bishepqet");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Yohanna", "Revolving Doors");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Shawn Hook", "Sound Of Your Heart");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "Broods", "Free");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "DNCE", "Cake By The Ocean");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "Mylène Farmer", "Un jour ou l'autre");
	contestInfo[47] = new entryInfo("Thorway",3, "Thorway", "Rasmus Seebach", "Lille Store Verden");
	contestInfo[48] = new entryInfo("Tikata",4, "Tikata", "Amir", "Oasis");
	contestInfo[49] = new entryInfo("Timivar",5, "Timivar", "MitiS & Adara", "Foundations");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Melody", "In My Mind");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Efterklang", "Dreams Today");
	contestInfo[52] = new entryInfo("Victoria",2, "Victoria", "Anna Sedokova", "Poka Milyy");
	contestInfo[53] = new entryInfo("Xara Khanate",2, "Xara Khanate", "İrem", "Hayalet Sevgilim");
	contestInfo[54] = new entryInfo("Zephyrus",3, "Zephyrus", "LikesBerry", "Danser Pour Toi");


	
	host = 22;


    }
    private void ISC47()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Trevor Morris", "Vikings Suite");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Zara Larsson & MNEK", "Never Forget You");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Zuzana Smatanová", "Horou");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Laura Marano", "Boombox");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "Jessica Lowndes", "Deja Vu");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "Goto80", "Breakfast");
	contestInfo[6] = new entryInfo("Bubblique",5, "Bubblique", "Emma Bale ft. Milow", "Fortune Cookie");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Bosse", "Steine");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Fleurie", "Sirens");
	contestInfo[9] = new entryInfo("Darkria",4, "Darkria", "Vremya & Steklo", "Zaberi");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Lao Ra", "Jesus Made Me Bad");
	contestInfo[11] = new entryInfo("Fierce",2, "Fierce", "Rae Morris", "Love Again");
	contestInfo[12] = new entryInfo("Gandhara",3, "Gandhara", "Hanine", "Nostalgia");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Mørland", "Skin");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "Taher Shah", "Angel");
	contestInfo[15] = new entryInfo("Hanzyuki",2, "Hanzyuki", "Delta Goodrem", "Wings");
	contestInfo[16] = new entryInfo("Háttuka",1, "Hattuka", "Deolinda", "Corzinha De Verão");
	contestInfo[17] = new entryInfo("Haven",5, "Haven", "Zedd & Kesha", "True Colors");
	contestInfo[18] = new entryInfo("Huania",2, "Huania", "Eric Saade", "Colors");
	contestInfo[19] = new entryInfo("Land of Jhe Freeh",4, "Land of Jhe Freeh", "ZOË", "Devinez");
	contestInfo[20] = new entryInfo("Kaledonii",4, "Kaledonii", "De Dødelige", "Os To");
	contestInfo[21] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Rihanna", "S&M");
	contestInfo[22] = new entryInfo("Keohretcha",2, "Keohretcha", "Francesco Salvi", "Esatto");
	contestInfo[23] = new entryInfo("Kimmystan",3, "Kimmystan", "Allie X", "Sanctuary");
	contestInfo[24] = new entryInfo("Kosma",2, "Kosma", "Jannika B", "Niagara");
	contestInfo[25] = new entryInfo("Lacrea",1, "Lacrea", "Aqualung ft. Kina Grannis", "To The Wonder");
	contestInfo[26] = new entryInfo("Laranjeiras",4, "RC Laranjeiras", "Getter Jaani & Koit Toome", "Rannamaja");
	contestInfo[27] = new entryInfo("Leshia",5, "Leshia", "Elizma Theron", "Oppad Na Jou");
	contestInfo[28] = new entryInfo("Luzze",1, "Luzze", "Giangrande", "Paper Plane");
	contestInfo[29] = new entryInfo("Mensa",1, "Mensa", "Orbita", "Slow Show FM");
	contestInfo[30] = new entryInfo("Monteverde",1, "Monteverde", "Fismoll", "Apnea");
	contestInfo[31] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Kristian Kristensen", "Kan Du Lære Mæ?");
	contestInfo[32] = new entryInfo("Noxus",3, "Noxus", "Galin ft. Ani Hoang & Kristiana", "Mezhdu Nas");
	contestInfo[33] = new entryInfo("Ova Anova",3, "Ova Anova", "Era Istrefi", "Bonbon");
	contestInfo[34] = new entryInfo("Pebbleland",1, "Pebbleland", "Francesca Michielin", "L'amore esiste");
	contestInfo[35] = new entryInfo("Pen Island",5, "Pen Island", "Astrid S", "Paper Thin");
	contestInfo[36] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Mia Martina", "Heart Fucking Hurts");
	contestInfo[37] = new entryInfo("Pönö",3, "Pono", "Kotiteollisuus", "Helvetti jäätyy");
	contestInfo[38] = new entryInfo("Porielana",3, "Porielana", "Alvaro Soler", "Sofia");
	contestInfo[39] = new entryInfo("Rata Sum",3, "Rata Sum", "Kygo ft. Kodaline", "Raging");
	contestInfo[40] = new entryInfo("Republica Libera",4, "Republica Libera", "Krista Siegfrids", "Can You See Me?");
	contestInfo[41] = new entryInfo("Ruthsina",1, "Ruthsina", "Bob Roc", "Langliglang");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Daniel Boaventura", "I Love the Nightlife");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Tiziano Ferro", "La differenza tra me e te");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "M83 ft. Susanne Sundfør", "Oblivion");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "Vaults", "Midnight River");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "Cécile Corbel", "Arrietty's Song");
	contestInfo[47] = new entryInfo("Thorway",3, "Thorway", "Sys Bjerre", "Hey Vanessa");
	contestInfo[48] = new entryInfo("Tikata",4, "Tikata", "Dawid Podsiadlo", "W Dobrą Stronę¨");
	contestInfo[49] = new entryInfo("Timivar",5, "Timivar", "Sébastien Tellier", "Russian Attractions");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Roko", "Luz");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Illuminine (ft. I will I swear)", "Armor");
	contestInfo[52] = new entryInfo("Victoria",2, "Victoria", "Olivier Dion", "Je t'aime c'est tout");
	contestInfo[53] = new entryInfo("Xara Khanate",2, "Xara Khanate", "Laleh", "Bara få va mig själv");
	contestInfo[54] = new entryInfo("Zephyrus",3, "Zephyrus", "K3", "Kusjessoldaten");


	host = 21;
    }
    private void ISC48()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "LUNA", "Free Somebody");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Måns Zelmerlöw & Petra Mede", "Love Love Peace Peace");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Transviolet", "New Bohemia");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Alessia Cara", "Wild Things");
	contestInfo[4] = new entryInfo("Aurävaan",2, "Auravaan", "Unnur Eggerts", "Vio Stingum Af");
	contestInfo[5] = new entryInfo("Auspikitan",5, "Auspikitan", "Yall ft Gabriela Richardson", "Hundred Miles");
	contestInfo[6] = new entryInfo("Bitland",1, "Bitland", "MaLituanie", "SodaiSia");
	contestInfo[7] = new entryInfo("Bubblique",3, "Bubblique", "Marina & the Diamonds", "Teen Idle");
	contestInfo[8] = new entryInfo("Caprika",2, "Caprika", "Jamie Grace", "1945");
	contestInfo[9] = new entryInfo("Chruno",5, "Chruno", "Kyla La Grange", "Hummingbird");
	contestInfo[10] = new entryInfo("Darkria",1, "Darkria", "Dolcenera", "Accendi lo spirito");
	contestInfo[11] = new entryInfo("Eriod",1, "Eriod", "Mercedes Band", "Sofi");
	contestInfo[12] = new entryInfo("Fierce",4, "Fierce", "Bomba Estéreo", "Somos Dos");
	contestInfo[13] = new entryInfo("Gandhara",2, "Gandhara", "Ayumi ft Batyr", "Hey-La");
	contestInfo[14] = new entryInfo("Grolskira",2, "Grolskira", "Alina Orlova", "Sielos sala");
	contestInfo[15] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "ONUKA", "19 86");
	contestInfo[16] = new entryInfo("Hanzyuki",2, "Hanzyuki", "Maria Hazell", "Golden Boy");
	contestInfo[17] = new entryInfo("Háttuka",1, "Hattuka", "AnnenMayKantereit", "21 22 23");
	contestInfo[18] = new entryInfo("Haven",5, "Haven", "Justin Timberlake", "Can't Stop the Feeling!");
	contestInfo[19] = new entryInfo("Huania",3, "Huania", "SEL ft Camille", "Monaco");
	contestInfo[20] = new entryInfo("Land of Jhe Freeh",2, "Land of Jhe Freeh", "Edsilia Rombley", "Als Jij Me Belooft");
	contestInfo[21] = new entryInfo("Kaledonii",4, "Kaledonii", "Lana Del Rey", "Young and Beautiful");
	contestInfo[22] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Brand X Music", "Dragon's Breath");
	contestInfo[23] = new entryInfo("Keohretcha",2, "Keohretcha", "Arisa", "Malamoreno");
	contestInfo[24] = new entryInfo("Kimmystan",5, "Kimmystan", "Ina Wroldsen & Broiler", "Lay It On Me");
	contestInfo[25] = new entryInfo("Kosma",2, "Kosma", "Anna Kokkonen", "Tuulen poika");
	contestInfo[26] = new entryInfo("Lacrea",1, "Lacrea", "Lisandro Aristimuno", "Pozo");
	contestInfo[27] = new entryInfo("Laranjeiras",4, "RC Laranjeiras", "Donkeyboy", "Trigger Finger");
	contestInfo[28] = new entryInfo("Leshia",4, "Leshia", "MUNA", "Winterbreak");
	contestInfo[29] = new entryInfo("Luzze",1, "Luzze", "Mikael Saari", "Storms");
	contestInfo[30] = new entryInfo("Mensa",1, "Mensa", "Vejopatis ", "Veliu sokis");
	contestInfo[31] = new entryInfo("Monteverde",5, "Monteverde", "COSOVEL", "Sorbetowy");
	contestInfo[32] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Highasakite", "Someone Who'll Get It");
	contestInfo[33] = new entryInfo("Noxus",3, "Noxus", "Zalvarinis", "Alaus alaus");
	contestInfo[34] = new entryInfo("Ova Anova",3, "Ova Anova", "Jamala", "Obeshchanye");
	contestInfo[35] = new entryInfo("Pebbleland",1, "Pebbleland", "Selah Sue", "This World");
	contestInfo[36] = new entryInfo("Pen Island",5, "Pen Island", "LYRA", "Emerald");
	contestInfo[37] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Ladyhawke", "A Love Song");
	contestInfo[38] = new entryInfo("Pönö",3, "Pono", "Omar Arnaout", "Story of Life");
	contestInfo[39] = new entryInfo("Porielana",4, "Porielana", "Kelly Sweet", "Ashes of My Paradise");
	contestInfo[40] = new entryInfo("Rata Sum",3, "Rata Sum", "Jun Hyo Seong ft D Action", "Find Me");
	contestInfo[41] = new entryInfo("Republica Libera",3, "Republica Libera", "Magnit", "Laiko Rate");
	contestInfo[42] = new entryInfo("Ruthsina",1, "Ruthsina", "Zhou Sheng", "Big Fish & Begonia");
	contestInfo[43] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Rachel Platten", "Stand By You");
	contestInfo[44] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Hannah Jane Lewis", "Why Start a War");
	contestInfo[45] = new entryInfo("Sunetti",5, "Sunetti", "Rykka", "Movies");
	contestInfo[46] = new entryInfo("Tashkveny",3, "Tashkveny", "Mánran", "Scottishe");
	contestInfo[47] = new entryInfo("Territrius",1, "Territrius", "Alice on the Roof", "Lucky You");
	contestInfo[48] = new entryInfo("Thorway",2, "Thorway", "Embrace", "Commitment Issues");
	contestInfo[49] = new entryInfo("Tikata",4, "Tikata", "Vianney", "Pas la");
	contestInfo[50] = new entryInfo("Timivar",5, "Timivar", "The Strumbella", "Spirits");
	contestInfo[51] = new entryInfo("Tonállan",2, "Tonallan", "Morat", "Cómo te atreves");
	contestInfo[52] = new entryInfo("Valdron",1, "Valdron", "Camila Moreno", "Tu mamá te mató");
	contestInfo[53] = new entryInfo("Victoria",3, "Victoria", "Superfly", "Beautiful");
	contestInfo[54] = new entryInfo("Zephyrus",3, "Zephyrus", "Chico & the Gypsies", "Bamboleo");



	host = 6;
    }
    private void ISC49()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Yseult", "Bye Bye Bye");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "Rootkit", "Against the Sun (feat. Anna Yvette)");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "AVEC", "Dead");
	contestInfo[3] = new entryInfo("Aurävaan",2, "Aurävaan", "Elliot Berger feat. Laura Brehm", "Diamond Sky");
	contestInfo[4] = new entryInfo("Auspikitan",5, "Auspikitan", "April Ivy", "Be Ok");
	contestInfo[5] = new entryInfo("Bitland",1, "Bitland", "Desert Planet", "Return of the Ninja Droids");
	contestInfo[6] = new entryInfo("Bubblique",3, "Bubblique", "The Chainsmokers feat. Daya", "Don't Let Me Down");
	contestInfo[7] = new entryInfo("Caprika",2, "Caprika", "Stereoact feat. Lerstom Ptt", "Die Immer Lacht");
	contestInfo[8] = new entryInfo("Chruno",5, "Chruno", "Young Kato", "Sunshine");
	contestInfo[9] = new entryInfo("Darkria",1, "Darkria", "Kasia Kowalska", "Aya");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Barns Courtney", "Glitter and Gold");
	contestInfo[11] = new entryInfo("Fierce",4, "Fierce", "Kongsted x Cisilia", "Wild Child");
	contestInfo[12] = new entryInfo("Gandhara",2, "Gandhara", "Rilaya", "Saf");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Sara Hartman", "Monster Lead Me Home");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "Alida", "Pinocchio");
	contestInfo[15] = new entryInfo("Hanzyuki",2, "Hanzyuki", "Walking On Cars", "Speeding Cars");
	contestInfo[16] = new entryInfo("Hattuka",1, "Hattuka", "Electric Guest", "Troubleman");
	contestInfo[17] = new entryInfo("Haven",5, "Haven", "Calvin Harris feat. Rihanna", "This Is What You Came For");
	contestInfo[18] = new entryInfo("Huania",3, "Huania", "Oh My Girl", "Liar Liar");
	contestInfo[19] = new entryInfo("Kaledonii",4, "Kaledonii", "Nathalie Saba", "Black Birds");
	contestInfo[20] = new entryInfo("Kaministiquia",5, "Kaministiquia", "t.A.T.u.", "All The Things She Said");
	contestInfo[21] = new entryInfo("Keohretcha",2, "Keohretcha", "Judy Garland", "Somewhere Over the Rainbow");
	contestInfo[22] = new entryInfo("Kimmystan",5, "Kimmystan", "NEEV", "Staring Through");
	contestInfo[23] = new entryInfo("Kosma",2, "Kosma", "Hanna Pakarinen", "Stronger Without You");
	contestInfo[24] = new entryInfo("Lacrea",1, "Lacrea", "David O'Dowda & Rachel Wood", "Keep Your Head");
	contestInfo[25] = new entryInfo("Land of Jhe Freeh",2, "Land of Jhe Freeh", "Mieka Pauley", "Marked Man");
	contestInfo[26] = new entryInfo("Laranjeiras",4, "Laranjeiras", "Disclosure feat. Eliza Doolittle", "You & Me (Flume Remix)");
	contestInfo[27] = new entryInfo("Leshia",4, "Leshia", "Lana Jurčević feat. Ante Cash", "Vrti mi se");
	contestInfo[28] = new entryInfo("Luzze",1, "Luzze", "Rerttu feat. Alexandra", "Waves");
	contestInfo[29] = new entryInfo("Mensa",1, "Mensa", "Kumea Sound", "Tantra");
	contestInfo[30] = new entryInfo("Monteverde",5, "Monteverde", "Mary Komasa", "Lost Me");
	contestInfo[31] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "The Lumineers", "Sleep On The Floor");
	contestInfo[32] = new entryInfo("Noxus",3, "Noxus", "Zlata Ognevich", "Za Litom Za Vesnoyu");
	contestInfo[33] = new entryInfo("Ova Anova",3, "Ova Anova", "Ariana Grande", "Into You");
	contestInfo[34] = new entryInfo("Pebbleland",1, "Pebbleland", "Justs", "Ko tu dari?");
	contestInfo[35] = new entryInfo("Pen Island",5, "Pen Island", "Dua Lipa", "Hotter Than Hell");
	contestInfo[36] = new entryInfo("Ponásikwa",5, "Ponasikwa", "Bebe Rexha", "Cry Wolf");
	contestInfo[37] = new entryInfo("Pono",3, "Pono", "Runaway Zoo", "Youngwildblood");
	contestInfo[38] = new entryInfo("Porielana",4, "Porielana", "Sergey Lazarev", "Take It Off");
	contestInfo[39] = new entryInfo("Rata Sum",3, "Rata Sum", "Kim Bo Kyung", "Hurt");
	contestInfo[40] = new entryInfo("Republica Libera",3, "Republica Libera", "Donny Montell", "Fly");
	contestInfo[41] = new entryInfo("Ruthsina",1, "Ruthsina", "Tan Weiwei", "All Things Alive");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Inga & Tigerforest", "Moonlit Path");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Alicia Keys", "Empire State of Mind Part II (Broken Down)");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "Tamta", "Unloved");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "Joyce Jonathan", "Caractère");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "Frances", "Don't You Let Me Down");
	contestInfo[47] = new entryInfo("Thorway",2, "Thorway", "Volbeat", "The Gardens Tale");
	contestInfo[48] = new entryInfo("Tikata",4, "Tikata", "Yamini", "Irul thingum vaanil");
	contestInfo[49] = new entryInfo("Timivar",5, "Timivar", "Ravenia", "We All Died For Honor");
	contestInfo[50] = new entryInfo("Tonállan",2, "Tonallan", "Fuel Fandango", "Salvaje");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Ed Harcourt", "The Saddest Orchestra (It Only Plays For You)");
	contestInfo[52] = new entryInfo("Victoria",3, "Victoria", "Lena", "Beat To My Melody");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Carmen Cartio feat. Khaled", "Henna");
	
	host = 34;
    }
    private void ISC50()
    {
	contestInfo[0] = new entryInfo("Alma Livre",2, "Alma Livre", "Il Volo", "L'amore si muove");
	contestInfo[1] = new entryInfo("Alteus",5, "Alteus", "The Girl and the Dreamcatcher", "Glowing in the Dark");
	contestInfo[2] = new entryInfo("Amsteris",4, "Amsteris", "Nina Nesbitt", "Chewing Gum");
	contestInfo[3] = new entryInfo("Aonach",4, "Aonach", "Helena Paparizou", "Otan Aggeli Klene");
	contestInfo[4] = new entryInfo("Aurävaan",2, "Aurävaan", "Carly Rae Jepsen ft. Owl City", "Good Time");
	contestInfo[5] = new entryInfo("Auspikitan",5, "Auspikitan", "Dotter", "Creatures of the Sun");
	contestInfo[6] = new entryInfo("Bitland",1, "Bitland", "Andrew Judah", "Hell?");
	contestInfo[7] = new entryInfo("Bubblique",3, "Bubblique", "Ruth B", "Lost Boy");
	contestInfo[8] = new entryInfo("Caprika",2, "Caprika", "Yan Yi Dan", "Three Inches to Heaven");
	contestInfo[9] = new entryInfo("Chruno",5, "Chruno", "First Aid Kit", "Stay Gold");
	contestInfo[10] = new entryInfo("Eriod",1, "Eriod", "Crystal Fighters", "Follow");
	contestInfo[11] = new entryInfo("Fierce",4, "Fierce", "LP", "Lost On You");
	contestInfo[12] = new entryInfo("Gandhara",2, "Gandhara", "Kamila Zhumabayeva", "Qazaq Batyrlary");
	contestInfo[13] = new entryInfo("Grolskira",2, "Grolskira", "Auf der Maur", "Followed the Waves");
	contestInfo[14] = new entryInfo("H Kim Jong Il's AD Hangug",3, "HKJIADH", "Tiffany Trump", "Like a Bird");
	contestInfo[15] = new entryInfo("Hanzyuki",2, "Hanzyuki", "Les Hay Babies", "Fil De Téléphone");
	contestInfo[16] = new entryInfo("Haven",5, "Haven", "Daya", "Sit Still  Look Pretty");
	contestInfo[17] = new entryInfo("Huania",3, "Huania", "Evelina", "Sireenit");
	contestInfo[18] = new entryInfo("Kaledonii",4, "Kaledonii", "Katy Perry", "Rise");
	contestInfo[19] = new entryInfo("Kaministiquia",5, "Kaministiquia", "Jerry Goldsmith", "Soarin'");
	contestInfo[20] = new entryInfo("Keohretcha",2, "Keohretcha", "Crispian St. Peters", "The Pied Piper");
	contestInfo[21] = new entryInfo("Kimmystan",5, "Kimmystan", "Webcam Julia", "Private Act");
	contestInfo[22] = new entryInfo("Kosma",2, "Kosma", "Natalia y Maka", "Olvidarte Hoy");
	contestInfo[23] = new entryInfo("Lacrea",1, "Lacrea", "Johanan", "Go On (Let It Go)");
	contestInfo[24] = new entryInfo("Land of Jhe Freeh",2, "Land of Jhe Freeh", "Chrisette Michele", "Love Is You");
	contestInfo[25] = new entryInfo("Laranjeiras",4, "Laranjeiras", "David Guetta ft. Zara Larsson", "This One's For You");
	contestInfo[26] = new entryInfo("Leshia",4, "Leshia", "AlunaGeorge", "I Remember");
	contestInfo[27] = new entryInfo("Luzze",1, "Luzze", "Okra Playground", "Kaunokieli");
	contestInfo[28] = new entryInfo("Mensa",1, "Mensa", "Tengger Cavalry", "Hymn of the Earth");
	contestInfo[29] = new entryInfo("Monteverde",5, "Monteverde", "Color Indio", "Ly O Lay Aleloya");
	contestInfo[30] = new entryInfo("Nicolas' Neighbour",4, "Nicolas' Neighbour", "Joe Hisaishi", "The legend of Ashitaka Theme");
	contestInfo[31] = new entryInfo("Noxus",3, "Noxus", "Rebecca & Fiona", "Drugstore Lovin'");
	contestInfo[32] = new entryInfo("Ova Anova",3, "Ova Anova", "Clean Bandit ft. Louisa Johnson", "Tears");
	contestInfo[33] = new entryInfo("Pebbleland",1, "Pebbleland", "PYØR", "Broke My Rules");
	contestInfo[34] = new entryInfo("Pen Island",5, "Pen Island", "Bloom Twins", "A M N E S I A");
	contestInfo[35] = new entryInfo("Ponásikwa",5, "Ponasikwa", "MØ", "Final Song");
	contestInfo[36] = new entryInfo("Pönö",3, "Pono", "Fleur Magali", "Hungry 4 Your Love");
	contestInfo[37] = new entryInfo("Porielana",4, "Porielana", "Raluka", "No Question");
	contestInfo[38] = new entryInfo("Raingate",2, "Raingate", "Before You Exit", "When I'm Gone");
	contestInfo[39] = new entryInfo("Rata Sum",3, "Rata Sum", "Cosmic Girls (WJSN)", "Catch Me");
	contestInfo[40] = new entryInfo("Republica Libera",3, "Republica Libera", "Celeste Buckingham", "Love in Your Soul");
	contestInfo[41] = new entryInfo("Ruthsina",1, "Ruthsina", "Marco Pereira- Bate-Coxa", "Yang Yufei");
	contestInfo[42] = new entryInfo("Saint Eva & Lepland",4, "SEAL", "Cyndi Lauper", "Time After Time");
	contestInfo[43] = new entryInfo("Spitzenbergen",4, "Spitzenbergen", "Andra Day", "Rise Up");
	contestInfo[44] = new entryInfo("Sunetti",5, "Sunetti", "M83", "Un Nouveau Soleil");
	contestInfo[45] = new entryInfo("Tashkveny",3, "Tashkveny", "Rihanna", "Sledgehammer");
	contestInfo[46] = new entryInfo("Territrius",1, "Territrius", "Tailor", "Wolf");
	contestInfo[47] = new entryInfo("Thorway",2, "Thorway", "Blak", "Nede Mette");
	contestInfo[48] = new entryInfo("Tikata",4, "Tikata", "Brodka", "Horses");
	contestInfo[49] = new entryInfo("Timivar",5, "Timivar", "Novo Amor & Ed Tullett", "Alps");
	contestInfo[50] = new entryInfo("Tonallán",2, "Tonallan", "Mitre ft. Gabriela Villalba", "Saudade");
	contestInfo[51] = new entryInfo("Valdron",1, "Valdron", "Narsilion", "El Retorn a la Infantesa");
	contestInfo[52] = new entryInfo("Victoria",3, "Victoria", "Cailee Rae", "Anchor");
	contestInfo[53] = new entryInfo("Zephyrus",3, "Zephyrus", "Billy Crawford", "Trackin'");


	host = 14;
    }

    public int getHost()
    {

	return host;
    }
    public entryInfo[] getContestInfo()
    {
	return contestInfo;
    }
    public int getAmountCountries()
    {
	
	return amountCountries;
    }
}
