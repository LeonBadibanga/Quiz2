package com.example.quiz2;

import java.util.*;

public class Quiz {
    private List<String> questionsList;
    private List<String[]> optionsList;
    private List<Integer> answersList;

    private int score;
    private Scanner scanner;

    public Quiz() {
        questionsList = new ArrayList<>();
        optionsList = new ArrayList<>();
        answersList = new ArrayList<>();
        score = 0;
        scanner = new Scanner(System.in);
        initializeQuestionsAndAnswers();

        questionsList.add("Wat is de grootste planeet in ons zonnestelsel?");
        optionsList.add(new String[]{"Mars", "Jupiter", "Aarde", "Saturnus"});
        answersList.add(1); // Index van het juiste antwoord in de optionsList

        questionsList.add("Hoe heet in de psychologie het gevoel dat men een huidige situatie al eens eerder heeft meegemaakt?");
        optionsList.add(new String[]{"Deja-vu", "Jamais vu", "Presque vu", "Vuja de"});
        answersList.add(0);

        questionsList.add("Welke kleur krijg je als je magenta mengt met cyaan?");
        optionsList.add(new String[]{"Bruin", "Rood", "Turkoois", "Paars"});
        answersList.add(3);

        questionsList.add("Waar ben je bang voor als je cryofobie hebt?");
        optionsList.add(new String[]{"Ailurofobie", "Acrofobie", "Cryofobie", "Arachnofobie"});
        answersList.add(2);

        questionsList.add("Hoe heet iemand die van regenachtig weer houdt?");
        optionsList.add(new String[]{"Nefelofiel", "Aerophile", "Solarophile", "Pluviophile"});
        answersList.add(3);

        questionsList.add("Hoeveel karaat is puur goud?");
        optionsList.add(new String[]{"16 karaat", "24 karaat", "18 karaat", "30 karaat"});
        answersList.add(1);

        questionsList.add("Hoe heette de rechterhand van Fidel Castro tijdens de Cubaanse revolutie?");
        optionsList.add(new String[]{"Che Guevara", "Raúl Castro", "Hugo Chávez", "Juan Almeida"});
        answersList.add(0); // Che Guevara

        questionsList.add("Wat was de grootste archeologische vondst van de 20e eeuw in China?");
        optionsList.add(new String[]{"Terracottaleger", "Zijderoute-schatten", "Shang-dynastie-orakelbotten", "Grote Chinese Muur-vondst"});
        answersList.add(0); // Terracottaleger

        questionsList.add("Wanneer werden de eerste Olympische Spelen door de Grieken gehouden?");
        optionsList.add(new String[]{"200 na Christus", "500 voor Christus", "776 voor Christus", "100 voor Christus"});
        answersList.add(2); // 776 voor Christus

        questionsList.add("Welk metaal is als enige bij kamertemperatuur vloeibaar?");
        optionsList.add(new String[]{"Ijzer", "Goud", "Kwik", "Lood"});
        answersList.add(2); // Kwik

        questionsList.add("Wat is GEEN priemgetal?");
        optionsList.add(new String[]{"499", "103", "8", "5"});
        answersList.add(2); // 8

        questionsList.add("Met welk gas wordt een ballon opgeblazen die kan zweven?");
        optionsList.add(new String[]{"Helium", "Waterstof", "Stikstof", "Zuurstof"});
        answersList.add(0); // Helium

        questionsList.add("Welke stad heeft het hoogste inwoneraantal?");
        optionsList.add(new String[]{"Tokio", "Peking", "Shanghai", "Delhi"});
        answersList.add(3); // Delhi

        questionsList.add("Wat is de duurste stad om in te wonen?");
        optionsList.add(new String[]{"Zürich", "Hongkong", "Genève", "Monaco"});
        answersList.add(0); // Zürich

        questionsList.add("Wat is de naam van het iconische gebouw in Sydney dat bekend staat om zijn unieke zeilschelpvormige dakconstructie?");
        optionsList.add(new String[]{"Sydney Harbour Bridge", "Sydney Tower", "Sydney Convention and Exhibition Centre", "Sydney Opera House"});
        answersList.add(3); // Sydney Opera House

        questionsList.add("Welke beroemde componist werd doof maar bleef componeren?");
        optionsList.add(new String[]{"Wolfgang Amadeus Mozart", "Johann Sebastian Bach", "Franz Schubert", "Ludwig van Beethoven"});
        answersList.add(3); // Ludwig van Beethoven

        questionsList.add("Welke Poolse componist staat bekend om zijn pianomuziek, zoals de ‘Mazurka’s en ‘Nocturnes’?");
        optionsList.add(new String[]{"Frederic Chopin", "Igor Stravinsky", "Antonín Dvoák", "Pyotr Ilyich Tchaikovsky"});
        answersList.add(0); // Frederic Chopin

        questionsList.add("Welk muziekinstrument is kenmerkend voor de flamenco, een Spaanse muziek- en dansstijl?");
        optionsList.add(new String[]{"Castagnetten", "Gitaar", "Accordeon", "Viool"});
        answersList.add(1); // Gitaar

        questionsList.add("Wat is de naam van de bekende Amerikaanse popartkunstenaar die het schilderij ‘Campbell’s Soup Cans’ maakte?");
        optionsList.add(new String[]{"Jean-michel Basquiat", "Jackson Pollock", "Andy Warhol", "Keith Haring"});
        answersList.add(2); // Andy Warhol

        questionsList.add("Hoe heet Frida Kahlo's bekendste werk?");
        optionsList.add(new String[]{"De gebroken zuil", "De dans", "Zelfportret met doornenketting en kolibrie", "de surrealistische droom"});
        answersList.add(2); // Zelfportret met doornenketting en kolibrie

        questionsList.add("Wat is het PI getal?");
        optionsList.add(new String[]{"3.14271", "3.14159", "3.14161", "3.14182"});
        answersList.add(1); // 3.14159

        questionsList.add("Welke architect heeft zowel het Rijksmuseum als het Amsterdamse centraal station ontworpen?");
        optionsList.add(new String[]{"Pierre Cuypers", "Hendrik Petrus Berlage", "Gerrit Rietveld", "Rem Koolhaas"});
        answersList.add(0); // Pierre Cuypers

        questionsList.add("Welke bekende straatkunstenaar staat bekend om zijn werk 'Kissing coppers'?");
        optionsList.add(new String[]{"Shepard Fairey", "JR", "Invader", "Banksy"});
        answersList.add(3); // Banksy

        questionsList.add("Welk merk gebruikt 'Andre the giant' als logo?");
        optionsList.add(new String[]{"Abercrombie & Fitch", "Lacoste", "Vivienne Westwood", "Obey"});
        answersList.add(3); // Obey

        questionsList.add("Wat is een terp?");
        optionsList.add(new String[]{"Een soort snoepgoed", "Een oude munteenheid", "Een kunstmatige heuvel", "Een traditioneel dansritueel"});
        answersList.add(2); // Een kunstmatige heuvel

        questionsList.add("Welke beeldhouwer maakte 'de denker'?");
        optionsList.add(new String[]{"Michelangelo", "Auguste Rodin", "Leonardo da Vinci", "Donatello"});
        answersList.add(1); // Auguste Rodin

        questionsList.add("Welke bloedgroep komt het vaakst voor?");
        optionsList.add(new String[]{"A", "B", "AB", "O"});
        answersList.add(3); // O

        questionsList.add("Wat wordt bedoeld met horripilatie of spasmodermie?");
        optionsList.add(new String[]{"Koude rillingen", "Angstzweet", "Spierkrampen", "Hoofdpijn"});
        answersList.add(0); // Koude rillingen

        questionsList.add("Hoe noemen we een toevallige uitvinding?");
        optionsList.add(new String[]{"Incidentele creatie", "Accidentele ontdekking", "Willekeurige innovatie", "Serendipiteit"});
        answersList.add(3); // Serendipiteit

        questionsList.add("Waarvoor staat de afkorting Aldi, het voordelige supermarktbedrijf?");
        optionsList.add(new String[]{"Algemeen Lage Dagelijkse Inkopen", "Albrecht-Diskont", "Allgemeiner Lebensmittel-Diskont", "Aldus Inkoop"});
        answersList.add(1); // Albrecht-Diskont

        questionsList.add("Wat is de naam van de grootste maan van Jupiter?");
        optionsList.add(new String[]{"Ganymedes", "Io", "Europa", "Callisto"});
        answersList.add(0); // Ganymedes

        questionsList.add("Welk element heeft het atoomnummer 79?");
        optionsList.add(new String[]{"Goud", "Zilver", "Koper", "Kwik"});
        answersList.add(2); // Koper

        questionsList.add("Wat is de hoofdstad van Nieuw-Zeeland?");
        optionsList.add(new String[]{"Canberra", "Auckland", "Sydney", "Wellington"});
        answersList.add(3); // Wellington

        questionsList.add("Hoeveel continenten zijn er op aarde?");
        optionsList.add(new String[]{"Vier", "Vijf", "Zes", "Zeven"});
        answersList.add(3); // Zeven

        questionsList.add("Wie schreef het boek \"1984\"?");
        optionsList.add(new String[]{"Aldous Huxley", "Tom Huxley", "George Orwell", "J.K. Rowling"});
        answersList.add(2); // George Orwell

        questionsList.add("Welke planeet wordt vaak de \"Rode Planeet\" genoemd?");
        optionsList.add(new String[]{"Mars", "Jupiter", "Saturnus", "Mercurius"});
        answersList.add(0); // Mars

        questionsList.add("Wat is het grootste zoogdier ter wereld?");
        optionsList.add(new String[]{"Walvis", "Blauwe vinvis", "Olifant", "Giraffe", "Nijlpaard"});
        answersList.add(1); // Blauwe vinvis

        questionsList.add("Welk land heeft de langste kustlijn ter wereld?");
        optionsList.add(new String[]{"Australië", "Canada", "Chili", "Noorwegen"});
        answersList.add(1); // Canada

        questionsList.add("Hoeveel procent van het menselijk lichaam bestaat uit water?");
        optionsList.add(new String[]{"60%", "70%", "80%", "90%"});
        answersList.add(2); // 80%

        questionsList.add("Wie was de eerste vrouwelijke premier van Groot-Brittannië?");
        optionsList.add(new String[]{"Margaret Thatcher", "Angela Merkel", "Jacinda Ardern", "Theresa May"});
        answersList.add(0); // Margaret Thatcher

        questionsList.add("Wat is de snelste landdier op aarde?");
        optionsList.add(new String[]{"Cheeta", "Luipaard", "Giraffe", "Gnoe"});
        answersList.add(0); // Cheeta

        questionsList.add("Welke gasvormige stof is essentieel voor fotosynthese?");
        optionsList.add(new String[]{"Stikstof", "Koolstofdioxide", "Zuurstof", "Methaan"});
        answersList.add(2); // Zuurstof

        questionsList.add("Wat is de grootste oceaan ter wereld?");
        optionsList.add(new String[]{"Atlantische Oceaan", "Stille Oceaan", "Indische Oceaan", "Noordelijke IJszee"});
        answersList.add(1); // Stille Oceaan

        questionsList.add("Wie schilderde de 'Sterrennacht'?");
        optionsList.add(new String[]{"Vincent van Gogh", "Claude Monet", "Pablo Picasso", "Leonardo da Vinci"});
        answersList.add(0); // Vincent van Gogh

        questionsList.add("Welk continent is het dunst bevolkt?");
        optionsList.add(new String[]{"Azië", "Afrika", "Oceanië", "Antarctica"});
        answersList.add(3); // Antarctica

        questionsList.add("Wat is het kleinste primgetal?");
        optionsList.add(new String[]{"nul", "één", "twee", "drie"});
        answersList.add(1); // één

        questionsList.add("Welke beroemde ontdekkingsreiziger bereikte als eerste de Zuidpool?");
        optionsList.add(new String[]{"Roald Amundsen", "Ernest Shackleton", "Robert Falcon Scott", "Richard E. Byrd"});
        answersList.add(0); // Roald Amundsen

        questionsList.add("Wat is de hoofdstad van Thailand?");
        optionsList.add(new String[]{"Hanoi", "Phnom Penh", "Vientiane", "Bangkok"});
        answersList.add(3); // Bangkok

        questionsList.add("Welke bekende natuurkundige bedacht de zwaartekrachtwet?");
        optionsList.add(new String[]{"Galileo Galilei", "Albert Einstein", "Isaac Newton", "Stephen Hawking"});
        answersList.add(2); // Isaac Newton

        questionsList.add("Welk land staat bekend als het 'Land van de Rijzende Zon'?");
        optionsList.add(new String[]{"China", "Japan", "Zuid-Korea", "Vietnam"});
        answersList.add(1); // Japan

        questionsList.add("Wie schreef het toneelstuk 'Romeo en Julia'?");
        optionsList.add(new String[]{"Jane Austen", "Charles Dickens", "Charles Fickens", "William Shakespeare"});
        answersList.add(3); // William Shakespeare

        questionsList.add("Wat is de grootste woestijn ter wereld?");
        optionsList.add(new String[]{"Sahara", "Gobi", "Kalahari", "Antarctica"});
        answersList.add(0); // Sahara

        questionsList.add("Welke beroemde schrijver schreef '1984' en 'Animal Farm'?");
        optionsList.add(new String[]{"Aldous Huxley", "Tom Huxley", "George Orwell", "J.K. Rowling"});
        answersList.add(2); // George Orwell

        questionsList.add("Welke kleur heeft een smaragd?");
        optionsList.add(new String[]{"Rood", "Groen", "Blauw", "Paars"});
        answersList.add(1); // Groen

        questionsList.add("Wat is de naam van het grootste zoetwatermeer ter wereld?");
        optionsList.add(new String[]{"Groot Meer", "Groot Zoutmeer", "Groot Oostmeer", "Groot Bovenmeer"});
        answersList.add(1); // Groot Zoutmeer

        questionsList.add("Wat is het belangrijkste kenmerk van een diamant?");
        optionsList.add(new String[]{"Hardheid", "Glanzende kleur", "Brekingsindex", "Transparantie"});
        answersList.add(0); // Hardheid

        questionsList.add("Wat is de grootste woestijn in Noord-Amerika?");
        optionsList.add(new String[]{"Mojave Desert", "Sonoran Desert", "Arctic Desert", "Great Basin Desert"});
        answersList.add(3); // Great Basin Desert

        questionsList.add("Welk element heeft het atoomnummer 92?");
        optionsList.add(new String[]{"Plutonium", "Neptunium", "Uranium", "Americium"});
        answersList.add(2); // Uranium

        questionsList.add("Welke kunstenaar staat bekend om zijn 'Starry Night Over the Rhône'?");
        optionsList.add(new String[]{"Claude Monet", "Pablo Picasso", "Edvard Munch", "Vincent van Gogh"});
        answersList.add(3); // Vincent van Gogh

        questionsList.add("Hoe noemen we een groep walvissen bij elkaar?");
        optionsList.add(new String[]{"Troep", "School", "Pod", "Kudde"});
        answersList.add(2); // Pod

        questionsList.add("Wat is de naam van het grootste eiland ter wereld?");
        optionsList.add(new String[]{"Australië", "Borneo", "Groenland", "Madagaskar"});
        answersList.add(2); // Groenland

        questionsList.add("Welke kleur heeft de edelsteen saffier?");
        optionsList.add(new String[]{"Blauw", "Rood", "Groen", "Geel"});
        answersList.add(0); // Blauw

        questionsList.add("Wat is de naam van de grootste maan van Saturnus?");
        optionsList.add(new String[]{"Enceladus", "Titan", "Rhea", "Mimas"});
        answersList.add(1); // Titan

        questionsList.add("Wie schilderde het beroemde werk 'De Sterrennacht'?");
        optionsList.add(new String[]{"Vincent van Gogh", "Pablo Picasso", "Claude Monet", "Edvard Munch"});
        answersList.add(0); // Vincent van Gogh

        questionsList.add("Wat is de hoofdstad van Japan?");
        optionsList.add(new String[]{"Seoel", "Peking", "Tokio", "Bangkok"});
        answersList.add(2); // Tokio

        questionsList.add("Welk land staat bekend om het produceren van de meeste chocolade ter wereld?");
        optionsList.add(new String[]{"België", "Zwitserland", "Nederland", "Ivoorkust"});
        answersList.add(3); // Ivoorkust

        questionsList.add("Welke schrijver won zowel de Nobelprijs voor Literatuur als de Nobelprijs voor de Vrede?");
        optionsList.add(new String[]{"Bertrand Russell", "Mario Vargas Llosa", "Elie Wiesel", "Rabindranath Tagore"});
        answersList.add(3); // Rabindranath Tagore

        questionsList.add("Wie was de eerste mens die de ruimte in ging?");
        optionsList.add(new String[]{"Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "Yuri Ivanovich"});
        answersList.add(0); // Yuri Gagarin

        questionsList.add("Wat is de meest gesproken taal ter wereld?");
        optionsList.add(new String[]{"Engels", "Spaans", "Mandarijn", "Hindi"});
        answersList.add(2); // Mandarijn

        questionsList.add("Welk dier is de grootste kat ter wereld?");
        optionsList.add(new String[]{"Tijger", "Leeuw", "Poema", "Luipaard"});
        answersList.add(1); // Leeuw

        questionsList.add("Hoeveel benen heeft een spin?");
        optionsList.add(new String[]{"Zes", "Zeven", "Acht", "Tien"});
        answersList.add(2); // Acht

        questionsList.add("Hoeveel planeten zijn er in ons zonnestelsel?");
        optionsList.add(new String[]{"Zeven", "Acht", "Negen", "Tien"});
        answersList.add(1); // Acht

        questionsList.add("Welk jaar werd de Berlijnse Muur gebouwd?");
        optionsList.add(new String[]{"1961", "1957", "1953", "1964"});
        answersList.add(0); // 1961

        questionsList.add("Wie schreef het boek 'Pride and Prejudice'?");
        optionsList.add(new String[]{"Charlotte Brontë", "George Eliot", "Edith Wharton", "Jane Austen"});
        answersList.add(3); // Jane Austen

        questionsList.add("Hoeveel continenten grenzen aan de Atlantische Oceaan?");
        optionsList.add(new String[]{"Vier", "Vijf", "Zes", "Drie"});
        answersList.add(1); // Vijf

        questionsList.add("Wat is de grootste orgaan in het menselijk lichaam?");
        optionsList.add(new String[]{"Dunne darm", "Lever", "Huid", "Longen"});
        answersList.add(2); // Huid

        questionsList.add("Hoeveel kilometer is een marathon?");
        optionsList.add(new String[]{"42.195", "40.139", "44.115", "38.250"});
        answersList.add(0); // 42.195

        questionsList.add("Wat is de hoogste waterval ter wereld?");
        optionsList.add(new String[]{"Tugela Falls", "Yumbilla Falls", "Olo'upena Falls", "Angel Falls"});
        answersList.add(3); // Angel Falls

        questionsList.add("Welk jaar begon de Franse Revolutie?");
        optionsList.add(new String[]{"1785", "1789", "1879", "1645"});
        answersList.add(1); // 1789

        questionsList.add("Wat is de naam van de grootste woestijn in Afrika?");
        optionsList.add(new String[]{"Kalahari", "Namibwoestijn", "Sahara", "Karoo"});
        answersList.add(2); // Sahara

        questionsList.add("Hoeveel spelers zijn er in een standaard basketbalteam?");
        optionsList.add(new String[]{"Elf", "Zeven", "Negen", "Vijf"});
        answersList.add(3); // Vijf

        questionsList.add("Wat is de hoofdstad van Egypte?");
        optionsList.add(new String[]{"Caïro", "Alexandrië", "Luxor", "Gizeh"});
        answersList.add(0); // Caïro

        questionsList.add("Wat is de grootste religie ter wereld?");
        optionsList.add(new String[]{"Christendom", "Islam", "Hindoeïsme", "Boeddhisme"});
        answersList.add(1); // Islam

        questionsList.add("Wat was de officiële naam van de Democratische Republiek Congo voordat het zijn huidige naam kreeg?");
        optionsList.add(new String[]{"Kongo-Vrijstaat", "Belgisch-Congo", "Kongo-Léopoldville", "Zaïre"});
        answersList.add(1); // Belgisch-Congo

        questionsList.add("In welk jaar verkreeg de Democratische Republiek Congo zijn onafhankelijkheid van België?");
        optionsList.add(new String[]{"1956", "1959", "1960", "1963"});
        answersList.add(2); // 1960

        questionsList.add("Welke natuurlijke hulpbron is een belangrijke bron van inkomsten voor de Democratische Republiek Congo?");
        optionsList.add(new String[]{"Diamanten", "Goud", "Koper", "Olie"});
        answersList.add(2); // Koper

        questionsList.add("Wat is de hoofdstad van de Democratische Republiek Congo?");
        optionsList.add(new String[]{"Kinshasa", "Lubumbashi", "Kisangani", "Goma"});
        answersList.add(0); // Kinshasa

        questionsList.add("Wat is de officiële taal van de Democratische Republiek Congo?");
        optionsList.add(new String[]{"Frans", "Engels", "Swahili", "Lingala"});
        answersList.add(0); // Frans

        questionsList.add("Welke dierenpopulatie in de Democratische Republiek Congo wordt bedreigd door stroperij en habitatverlies?");
        optionsList.add(new String[]{"Olifanten", "Leeuwen", "Gorilla's", "Nijlpaarden"});
        answersList.add(2); // Gorilla's

        questionsList.add("Welke technologische apparaten bevatten vaak coltan?");
        optionsList.add(new String[]{"Rookmelder", "Oven", "Lps", "Smartphones"});
        answersList.add(3); // Smartphones

        questionsList.add("Wat is de chemische formule van lachgas?");
        optionsList.add(new String[]{"N2O", "NO2", "CO2", "NH3"});
        answersList.add(0); // N2O

        questionsList.add("Wat is de hoogste berg van Afrika?");
        optionsList.add(new String[]{"Kilimanjaro", "Mount Kenya", "Mount Stanley", "Mount Elgon"});
        answersList.add(0); // Kilimanjaro

        questionsList.add("Welk land heeft de meeste tijdzones ter wereld?");
        optionsList.add(new String[]{"Rusland", "Verenigde Staten", "China", "Frankrijk"});
        answersList.add(0); // Rusland

        questionsList.add("Wie ontdekte penicilline?");
        optionsList.add(new String[]{"Alexander Fleming", "Louis Pasteur", "Joseph Lister", "Robert Koch"});
        answersList.add(0); // Alexander Fleming

        questionsList.add("Welk element heeft het hoogste kookpunt?");
        optionsList.add(new String[]{"Koolstof", "Wolfraam", "Goud", "Ijzer"});
        answersList.add(1); // Wolfraam

        questionsList.add("Welke van de volgende woorden betekent 'liefde voor boeken'?");
        optionsList.add(new String[]{"Bibliofobie", "Bibliomanie", "Bibliofilie", "Bibliografie"});
        answersList.add(2); // Bibliofilie

        questionsList.add("Hoeveel procent van de atmosfeer van de aarde bestaat uit zuurstof?");
        optionsList.add(new String[]{"46%", "55%", "80%", "21%"});
        answersList.add(3); // 21%

        questionsList.add("Welk beroemd architectonisch meesterwerk staat in India en wordt beschouwd als een van de zeven wereldwonderen?");
        optionsList.add(new String[]{"De Eiffeltoren", "Het Colosseum", "De Taj Mahal", "Het Vrijheidsbeeld"});
        answersList.add(2); // De Taj Mahal

        questionsList.add("Hoe heet de bekende Franse soep op basis van vis en schaaldieren?");
        optionsList.add(new String[]{"Bouillabaisse", "Ratatouille", "Vichyssoise", "Cassoulet"});
        answersList.add(0); // Bouillabaisse

        questionsList.add("Welk dier is de langste levende gewervelde diersoort ter wereld?");
        optionsList.add(new String[]{"Groenlandse walvis", "Galapagosalbatros", "Groenlandse haai", "Kokerworm"});
        answersList.add(2); // Groenlandse haai

    }

    public void startQuiz() {
        for (int i = 0; i < questionsList.size(); i++) {
            System.out.println("Vraag " + (i + 1) + ":");
            System.out.println(questionsList.get(i));
            String[] options = optionsList.get(i);
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            int userAnswer = getUserAnswer(options.length);
            if (userAnswer == answersList.get(i)) {
                System.out.println("Goed antwoord!");
                score++;
            } else {
                System.out.println("Helaas, fout antwoord.");
            }
        }
        System.out.println("Quiz voltooid. Je score is: " + score + "/" + questionsList.size());
    }
    private int getUserAnswer(int maxOptions) {
        int userAnswer;
        do {
            System.out.print("Antwoord (1-" + maxOptions + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ongeldige invoer. Voer een nummer in.");
                scanner.next();
            }
            userAnswer = scanner.nextInt();
            if (userAnswer < 1 || userAnswer > maxOptions) {
                System.out.println("Ongeldig antwoord. Voer een nummer tussen 1 en " + maxOptions + " in.");
            }
        } while (userAnswer < 1 || userAnswer > maxOptions);
        return userAnswer;
    }

    private void initializeQuestionsAndAnswers() {
        List<Integer> questionIndexes = new ArrayList<>();
        for (int i = 0; i < questionsList.size(); i++) {
            questionIndexes.add(i);
        }
        Collections.shuffle(questionIndexes);

        List<String> randomizedQuestions = new ArrayList<>();
        List<String[]> randomizedOptions = new ArrayList<>();
        List<Integer> randomizedAnswers = new ArrayList<>();

        for (int index : questionIndexes) {
            randomizedQuestions.add(questionsList.get(index));
            randomizedOptions.add(optionsList.get(index));
            randomizedAnswers.add(answersList.get(index));
        }

        questionsList = randomizedQuestions;
        optionsList = randomizedOptions;
        answersList = randomizedAnswers;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.startQuiz();
    }
}