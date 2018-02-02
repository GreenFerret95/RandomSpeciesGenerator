import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class URLReader {

	public static ArrayList<String> animalList = new ArrayList<String>();

	public static void main(String[] args) throws IOException {

		URL colostate = new URL("https://lib2.colostate.edu/wildlife/atoz.php?letter=ALL");
		BufferedReader in = new BufferedReader(new InputStreamReader(colostate.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null) {

			inputLine = inputLine.replaceAll("<table>", ""); // remove <table>
			inputLine = inputLine.replaceAll("</table>", "");
			inputLine = inputLine.replaceAll("<td>", ""); // remove <td>
			inputLine = inputLine.replaceAll("<tr>", ""); // remove <tr>
			inputLine = inputLine.replaceAll("</td>", ""); // remove </td>
			inputLine = inputLine.replaceAll("</tr>", ""); // remove </tr>

			inputLine = inputLine.replaceAll("<a", ""); // remove <a

			inputLine = inputLine.replaceAll("href=", ""); // remove href=
			inputLine = inputLine.replaceAll("\'", ""); // remove single quotes
			inputLine = inputLine.replaceAll("results.php", "");
			inputLine = inputLine.replaceAll("\\?", "");
			inputLine = inputLine.replaceAll("q=%", "");
			inputLine = inputLine.replaceAll("22", "");
			inputLine = inputLine.replaceAll("\\+", "");
			inputLine = inputLine.replaceAll("\\%", "");

			inputLine = inputLine.replaceAll("</a>", "");
			inputLine = inputLine.replaceAll("\\?", "");
			inputLine = inputLine.replaceAll("Genusspecies3", "");

			inputLine = inputLine.replaceAll("<body>", "");
			inputLine = inputLine.replaceAll("</body>", "");
			inputLine = inputLine.replaceAll("<footer>", "");
			inputLine = inputLine.replaceAll("</footer>", "");
			inputLine = inputLine.replaceAll("<span>", "");
			inputLine = inputLine.replaceAll("</span>", "");
			inputLine = inputLine.replaceAll("</html>", "");
			inputLine = inputLine.replaceAll("<!-- end footer -->", "");

			inputLine = inputLine.replaceAll("</div>", "");

			inputLine = inputLine.replaceAll("&bull;", "");

			inputLine = inputLine.replaceAll("</main>", "");
			inputLine = inputLine.replaceAll("<!-- start footer -->", "");
			inputLine = inputLine.replaceAll("http://", "");
			inputLine = inputLine.replaceAll("\"", "");
			inputLine = inputLine.replaceAll("www.", "");
			inputLine = inputLine.replaceAll("colostate.edu/", "");
			inputLine = inputLine.replaceAll("\\&gt;", "");

			inputLine = inputLine.replaceAll("<br />", "");
			inputLine = inputLine.replaceAll("<span ", "");
			inputLine = inputLine.replaceAll("</nav>", "");
			inputLine = inputLine.replaceAll("<nav ", "");

			inputLine = inputLine.replaceAll(">CSU Home", "");
			inputLine = inputLine.replaceAll("search>Search CSU", "");
			inputLine = inputLine.replaceAll("privacy/>Privacy", "");
			inputLine = inputLine.replaceAll("equal-opportunity/>Equal Opportunity", "");
			inputLine = inputLine.replaceAll("teaching.guides/copyright/>Copyright", "");
			inputLine = inputLine.replaceAll("disclaimer/>Disclaimer", "");

			inputLine = inputLine.replaceAll("role=contentinfo>", "");
			inputLine = inputLine.replaceAll("Animal List A to Z", "");
			inputLine = inputLine.replaceAll("./>garst Wildlife Photographic Collection", "");
			inputLine = inputLine.replaceAll("/digital-collections/>Digital Collections", "");
			inputLine = inputLine.replaceAll("/archives/ title=Archives and Special Collections>Archives", "");

			inputLine = inputLine.replaceAll("./>Garst Wildlife Photographic Collection", "");
			inputLine = inputLine.replaceAll("/ title=Colorado State University Libraries>Libraries", "");
			inputLine = inputLine.replaceAll("title=Colorado State University>CSU", "");
			inputLine = inputLine.replaceAll("role=navigation aria-label=breadcrumbs>", "");
			inputLine = inputLine.replaceAll("Last updated: 2017-08-14", "");
			inputLine = inputLine.replaceAll("URL: lib2.wildlife/atoz.php", "");

			inputLine = inputLine.replaceAll("<!-- AddThis Button END -->", "");
			inputLine = inputLine.replaceAll(
					" <script type=text/javascript src=//s7.addthis.com/js/300/addthis_widget.js#pubid=gregvogl></script>",
					"");
			inputLine = inputLine.replaceAll(
					"addthis.com/bookmark.phpv=300&amp;pubid=gregvogl class=addthis_button_compact>Share", "");
			inputLine = inputLine.replaceAll("class=addthis_toolbox addthis_default_style>", "");
			inputLine = inputLine.replaceAll("<!-- AddThis Button BEGIN -->", "");
			inputLine = inputLine.replaceAll("comments.php>Contact Us", "");
			inputLine = inputLine.replaceAll("sitemap.html>Site Map", "");

			inputLine = inputLine.replaceAll("copyright.html>Copyright &copy; 2000-2015", "");
			inputLine = inputLine.replaceAll("Content:  /commentsname=Victoria.Lopez-Terrill>Vicky Lopez-Terrill", "");
			inputLine = inputLine.replaceAll("<div id=navbot>", "");
			inputLine = inputLine.replaceAll("<footer id=bot>", "");
			inputLine = inputLine.replaceAll("<p>1498 rows displayed.</p>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divJ><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=J id=J>J</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<table class=names>", "");
			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divK><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=K id=K>K</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<table class=names>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divL><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=L id=L>L</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<table class=names>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divM><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=M id=M>M</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<table class=names>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divN><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=N id=N>N</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<table class=names>", "");

			inputLine = inputLine.replaceAll("<!DOCTYPE html>", "");
			inputLine = inputLine.replaceAll("<html lang=en>", "");
			inputLine = inputLine.replaceAll("<head>", "");
			inputLine = inputLine.replaceAll(
					"<title>ALL |  | Garst Wildlife Photos | Libraries | Colorado State University</title>", "");
			inputLine = inputLine.replaceAll("<meta charset=utf-8>", "");
			inputLine = inputLine.replaceAll("<meta name=viewport content=width=device-width, initial-scale=1>", "");
			inputLine = inputLine.replaceAll("<meta name=author content=Vicky Lopez-Terrill>", "");
			inputLine = inputLine.replaceAll("<link rel=stylesheet includes/styles.css>", "");

			inputLine = inputLine.replaceAll("<!--[if lt IE 9]>", "");
			inputLine = inputLine.replaceAll("<script src=//html5shiv.googlecode.com/svn/trunk/html5.js></script>", "");
			inputLine = inputLine.replaceAll("<link rel=stylesheet includes/styles-ie.css>", "");
			inputLine = inputLine.replaceAll("<![endif]-->", "");
			inputLine = inputLine.replaceAll("<script src=/includes/jquery-1.12.1.min.js></script>", "");
			inputLine = inputLine.replaceAll("<script src=includes/search.js></script>", "");
			inputLine = inputLine.replaceAll("<script src=includes/currpage.js></script>", "");
			inputLine = inputLine.replaceAll("<script src=/includes/digital/digital.js></script>", "");
			inputLine = inputLine.replaceAll("<script src=/includes/ga.js></script>", "");
			inputLine = inputLine.replaceAll("<link rel=stylesheet type=text/css includes/atoz.css>", "");
			inputLine = inputLine.replaceAll("</head>", "");
			inputLine = inputLine.replaceAll("<!-- start header -->", "");

			inputLine = inputLine.replaceAll("<p id=skip> #body>Skip to content</p>", "");
			inputLine = inputLine.replaceAll("<div id=doc>", "");
			inputLine = inputLine.replaceAll("<header id=header role=banner>", "");
			inputLine = inputLine.replaceAll("<div id=logos>", "");
			inputLine = inputLine.replaceAll(
					"title=Colorado State University ><img src=logos/csu.png id=csu-logo alt=Colorado State University />",
					"");
			inputLine = inputLine.replaceAll(
					"lib. title=Colorado State University Libraries><img src=logos/libraries.png id=libraries-logo alt=Colorado State University Libraries/>",
					"");
			inputLine = inputLine.replaceAll(
					"id=garstlogo ./ title=Garst Photographic Collection><img src=logos/garst760.jpg width=760 height=133 alt=Garst Wildlife Photographic Collection />",
					"");
			inputLine = inputLine.replaceAll("<div id=csusearch role=search>", "");
			inputLine = inputLine
					.replaceAll("<form id=searchform method=get action= onSubmit=submitSearch(); return false;>", "");
			inputLine = inputLine.replaceAll("<label for=q>Search for: </label>", "");
			inputLine = inputLine.replaceAll(
					"<input type=search name=q id=q size=30 maxlength=255 title=Search database of animal photographs />",
					"");

			inputLine = inputLine
					.replaceAll("<form id=searchform method=get action= onSubmit=submitSearch(); return false;>", "");
			inputLine = inputLine.replaceAll("<label for=field>in field: </label>", "");
			inputLine = inputLine.replaceAll("<select name=field id=field>", "");
			inputLine = inputLine.replaceAll("<option value= title=Search all fields>All fields</option>", "");
			inputLine = inputLine.replaceAll(
					"<option value=fulltopic title=Search animal common names and scientific names>Subject</option>",
					"");
			inputLine = inputLine.replaceAll(
					"<option value=description title=Search animal scientific names and characteristics>Description</option>",
					"");
			inputLine = inputLine.replaceAll("<option value=title title=Search photo titles>Title</option>", "");
			inputLine = inputLine
					.replaceAll("<option value=website title=Search Wildlife Photographs website>Website</option>", "");
			inputLine = inputLine.replaceAll("</select>", "");
			inputLine = inputLine
					.replaceAll("<input id=go type=submit title=Submit Search value=Search class=submit />", "");
			inputLine = inputLine.replaceAll("</form>", "");
			inputLine = inputLine.replaceAll("</header>", "");
			inputLine = inputLine.replaceAll("<div id=middle>", "");
			inputLine = inputLine.replaceAll("id=navleft role=navigation aria-label=main menu>", "");
			inputLine = inputLine.replaceAll("<div id=home>", "");

			inputLine = inputLine.replaceAll("<!--\\[if lt IE 9\\]>", "");
			inputLine = inputLine.replaceAll("<!\\[endif\\]-->", "");
			inputLine = inputLine.replaceAll("\\|", "");

			inputLine = inputLine.replaceAll("\\;", "");

			inputLine = inputLine
					.replaceAll("<form id=searchform method=get action= onSubmit=submitSearch\\(\\) return false>", "");
			inputLine = inputLine.replaceAll("<h3> . title=Garst Wildlife Photographic Collection>Home</h3>", "");
			inputLine = inputLine.replaceAll("<div id=about>", "");
			inputLine = inputLine.replaceAll("<h3> animals.html title=Learn about animals>About Animals</h3>", "");
			inputLine = inputLine.replaceAll("<ul>", "");
			inputLine = inputLine
					.replaceAll("<li> types.html title=Identify animals by their features>Characteristics</li>", "");
			inputLine = inputLine.replaceAll("<li> diet.html title=Food animals eat>Diet</li>", "");
			inputLine = inputLine.replaceAll("<li> places.html title=Places animals live \\(biomes\\)>Habitat</li>",
					"");
			inputLine = inputLine.replaceAll(
					"<li> endangered.html title=Animals that are endangered or threatened by extinction>Endangered Species</li>",
					"");
			inputLine = inputLine.replaceAll("<li> stories.html title=Animal stories from the Garsts>Stories</li>", "");
			inputLine = inputLine.replaceAll("</ul>", "");
			inputLine = inputLine.replaceAll("<li>", "");
			inputLine = inputLine.replaceAll("<div id=find>", "");
			inputLine = inputLine.replaceAll("<h3> find.html title=Browse or search for animals>Find Animals</h3>", "");
			inputLine = inputLine.replaceAll("</li>", "");

			inputLine = inputLine.replaceAll("atoz.php title=Animal list A to Z: Find animals by name>By Common Name",
					"");
			inputLine = inputLine.replaceAll(
					" taxonomy.html title=Find animals by taxonomy (scientific classification)>By Scientific Name", "");
			inputLine = inputLine.replaceAll("geography.html title=Find animals by geographic continent>By Continent",
					"");
			inputLine = inputLine.replaceAll("search.html title=Search for animals>Search", "");
			inputLine = inputLine.replaceAll("help.html title=How to find animals>Help", "");
			inputLine = inputLine.replaceAll("<div id=background>", "");
			inputLine = inputLine.replaceAll(
					"<h3> background.html title=Learn about the collection and its development>Background</h3>", "");
			inputLine = inputLine.replaceAll(
					"collection.html title=About the Garst Wildlife Photographic Collection>About the Collection", "");
			inputLine = inputLine.replaceAll("garst.html title=Biography of Warren and Genevieve Garst>Meet the Garsts",
					"");
			inputLine = inputLine.replaceAll(
					"acknowledge.html title=People and resources that helped create the site>Acknowledgements", "");
			inputLine = inputLine.replaceAll(
					"taxonomy.html title=Find animals by taxonomy \\(scientific classification\\)>By Scientific Name",
					"");
			inputLine = inputLine.replaceAll("websites.html title=Other Web sites about wildlife>Related Sites", "");
			inputLine = inputLine.replaceAll(
					"https://advancing.LIBRARY\\*47575 title=Make a financial contribution to the Garst project class=external>Make a Gift",
					"");
			inputLine = inputLine.replaceAll("<main id=body role=main>", "");
			inputLine = inputLine.replaceAll("<!-- end header -->", "");
			inputLine = inputLine.replaceAll("<form id=searchnames action=/wildlife/atoz.php method=get>", "");
			inputLine = inputLine.replaceAll("<input type=hidden name=sortby value=Common_Name>", "");
			inputLine = inputLine.replaceAll(
					"Search <input type=search id=searchtext name=search value= size=25 title=Search animal list autofocus>",
					"");
			inputLine = inputLine.replaceAll("<input type=submit class=submit title=Search animal list value=Go>", "");
			inputLine = inputLine.replaceAll("<h1></h1>", "");
			inputLine = inputLine.replaceAll(
					"<p>Type a search word to list animal names with that word \\(for example,/wildlife/atoz.phpsortby=Common_Name&ampsearch=cat>cat or/wildlife/atoz.phpsortby=Common_Name&ampsearch=tail>tail\\),",
					"");
			inputLine = inputLine.replaceAll(
					"or click a letter from <strong>A</strong> to <strong>Z</strong> to list animal names starting with that letter,",
					"");
			inputLine = inputLine.replaceAll(
					"or click <strong> atoz.phpletter=ALL>ALL</strong> to list all animals in the site. ", "");
			inputLine = inputLine.replaceAll("Also see thezoolexicon.html>Zoolexicon.", "");
			inputLine = inputLine.replaceAll(
					"Note: Only animals in the Garst Wildlife Photographic Collection \\(about 600 species\\) are listed.</p>",
					"");
			inputLine = inputLine.replaceAll("<div id=atoz>", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=A>A", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=B>B", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=C>C", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=D>D", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=E>E", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=F>F", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=G>G", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=H>H", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=I>I", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=J>J", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=K>K", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=L>L", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=M>M", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=N>N", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=O>O", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=P>P", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=Q>Q", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=R>R", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=S>S", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=T>T", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=U>U", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=V>V", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=W>W", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=X>X", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=Y>Y", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=Z>Z", "");
			inputLine = inputLine.replaceAll("/wildlife/atoz.phpsortby=Common_Name&ampletter=ALL>ALL", "");

			inputLine = inputLine.replaceAll("<p>To see an animal listed below, click on its Common Name.", "");
			inputLine = inputLine
					.replaceAll("Click <strong>Genus Species</strong> to change the search and sort column.</p>", "");

			inputLine = inputLine.replaceAll("<div>", "");
			inputLine = inputLine.replaceAll("<table id=sortby>", "");
			inputLine = inputLine.replaceAll(
					"<th> title=sort by Common Name /wildlife/atoz.phpsortby=Common_Name&ampletter=ALL>Common Name\\(s\\)</th><th> title=sort by Genus Species /wildlife/atoz.phpsortby=Genus_Species&ampletter=ALL>Genus Species</th>",
					"");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divA><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=A id=A>A</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divB><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=B id=B>B</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divC><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=C id=C>C</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divD><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=D id=D>D</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divE><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=E id=E>E</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divF><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=F id=F>F</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divG><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=G id=G>G</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divH><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=H id=H>H</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divI><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=I id=I>I</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divO><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=O id=O>O</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divP><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=P id=P>P</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divQ><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=Q id=Q>Q</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divR><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=R id=R>R</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divS><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=S id=S>S</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divT><table class=letter>", "");
			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divT><table class=letter>", "");
			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divU><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=U id=U>U</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divV><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=V id=V>V</th><th>class=toplink> #top>top</th>", "");

			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divW><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=W id=W>W</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divY><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=Y id=Y>Y</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("<div class=tab name=tab id=divZ><table class=letter>", "");
			inputLine = inputLine.replaceAll("<th> name=Z id=Z>Z</th><th>class=toplink> #top>top</th>", "");
			inputLine = inputLine.replaceAll("\\(unidentified\\)", "");

			if (inputLine.contains("&field=description")) {
				inputLine = "";
			}

			String subInputLine = inputLine.substring(inputLine.indexOf(">") + 1);
			subInputLine.trim();

			if (subInputLine != null && !subInputLine.isEmpty()) {
				animalList.add(subInputLine);
			}

		}

		in.close();

		for (int i = 0; i < animalList.size(); i++) {
			animalList.remove("");
			animalList.remove("\t");
			animalList.remove("\t ");
			animalList.remove(" ");
			animalList.remove("  ");
			animalList.remove(null);

		}

		/*
		 * int greatestAmountofWords = 0; String species = null; for(int i = 0;
		 * i < animalList.size(); i++){
		 * 
		 * if(animalList.get(i).contains(",")){ String[] split =
		 * animalList.get(i).split(",");
		 * 
		 * if(split.length > greatestAmountofWords){ greatestAmountofWords =
		 * split.length; species = animalList.get(i); } } else
		 * if(animalList.get(i).contains(" ")){ String[] split =
		 * animalList.get(i).split(" ");
		 * 
		 * if(split.length > greatestAmountofWords){ greatestAmountofWords =
		 * split.length; species = animalList.get(i); } } }
		 * 
		 * System.out.
		 * println("The species with the greatest amount of words is:  " +
		 * species +" and contains: " + greatestAmountofWords + " words\n\n");
		 * 
		 * 
		 */
		int randomSpeciesOne = (int) (Math.random() * animalList.size());
		int randomSpeciesTwo = (int) (Math.random() * animalList.size());

		String speciesOne = animalList.get(randomSpeciesOne);
		String speciesTwo = animalList.get(randomSpeciesTwo);

		System.out.println(speciesOne);
		System.out.println(speciesTwo);

		
		/*
		System.out.println("\n");

		String[] searchOne = null;
		String[] searchTwo = null;

		if (speciesOne.contains(",")) {
			System.out.println("species One contains a comma");

			searchOne = speciesOne.split(",");
			System.out.println("Species one split into " + searchOne.length + " parts");

		} else if (speciesOne.contains(" ")) {
			System.out.println("species One is separated by spaces");

			searchOne = speciesOne.split(" ");
			System.out.println("Species one split into " + searchOne.length + " parts");

		} else {
			System.out.println("Species One contains only one word");
		}

		System.out.println("\n");

		if (speciesTwo.contains(",")) {
			System.out.println("species Two contains a comma");

			searchTwo = speciesTwo.split(",");
			System.out.println("Species Two split into " + searchTwo.length + " parts");
		}

		else if (speciesTwo.contains(" ")) {
			System.out.println("species Two is separated by spaces");

			searchTwo = speciesTwo.split(" ");
			System.out.println("Species Two split into " + searchTwo.length + " parts");
		} else {
			System.out.println("Species Two only contains one word");
		}

		URL oneWordGoogleSearch_1;
		URL twoWordGoogleSearch_1;
		URL threeWordGoogleSearch_1;
		URL fourWordGoogleSearch_1;
		URL fiveWordGoogleSearch_1;

		BufferedReader searchOneIn = null;
		// if the species only has one word
		if (searchOne.length == 1) {
			oneWordGoogleSearch_1 = new URL(
					"https://www.google.com/search?biw=1366&bih=637&tbm=isch&sa=1&ei=l5c9WobfIsWCmQHi8Y_YBw&q="
							+ searchOne[0] + "&oq=" + searchOne[0]
							+ "&gs_l=psy-ab.3");
			searchOneIn = new BufferedReader(new InputStreamReader(oneWordGoogleSearch_1.openStream()));
		}

		// if the species has two words

		if (searchOne.length == 2) {
			twoWordGoogleSearch_1 = new URL(
					"https://www.google.com/search?tbm=isch&source=hp&biw=1366&bih=637&ei=jJM9WoqrNMbamQGW7KG4CQ&q="
							+ searchOne[0] + "+" + searchOne[1] + "&oq=" + searchOne[0] + "+" + searchOne[1]
							+ "&gs_l=img.3");
			
			searchOneIn = new BufferedReader(new InputStreamReader(twoWordGoogleSearch_1.openStream()));
		}

		// if the species has 3 words

		if (searchOne.length == 3) {
			threeWordGoogleSearch_1 = new URL(
					"https://www.google.com/search?biw=1366&bih=637&tbm=isch&sa=1&ei=XJ09WojaOYfLmwHI34LoBg&q="
							+ searchOne[0] + "+" + searchOne[1] + "+" + searchOne[2] + "&oq=" + searchOne[0] + "+"
							+ searchOne[1] + "+" + searchOne[2]
							+ "&gs_l=psy-ab.3");
			
			searchOneIn = new BufferedReader(new InputStreamReader(threeWordGoogleSearch_1.openStream()));
		}

		// if the species has 4 words

		if (searchOne.length == 4) {
			fourWordGoogleSearch_1 = new URL(
					"https://www.google.com/search?tbm=isch&source=hp&biw=1366&bih=637&ei=j5c9WpjhMonEmQGwkIL4DQ&q="
							+ searchOne[0] + "+" + searchOne[1] + "+" + searchOne[2] + "+" + searchOne[3] + "&oq="
							+ searchOne[0] + "+" + searchOne[1] + "+" + searchOne[2] + "+" + searchOne[3]
							+ "&gs_l=img.3");
			
			searchOneIn = new BufferedReader(new InputStreamReader(fourWordGoogleSearch_1.openStream()));
		}

		// if the species has 5 words

		if (searchOne.length == 5) {
			fiveWordGoogleSearch_1 = new URL(
					"https://www.google.com/search?biw=1366&bih=637&tbm=isch&sa=1&ei=e6Q9WsCyF4GsmwG4-YawAg&q="
							+ searchOne[0] + "+" + searchOne[1] + "+" + searchOne[2] + "+" + searchOne[3] + "+"
							+ searchOne[4] + "&oq=" + searchOne[0] + "+" + searchOne[1] + "+" + searchOne[2] + "+"
							+ searchOne[3] + "+" + searchOne[4]
							+ "&gs_l=psy-ab.3");
			
			searchOneIn = new BufferedReader(new InputStreamReader(fiveWordGoogleSearch_1.openStream()));
		}
		
		String searchOneHTMLInput;
		while ((searchOneHTMLInput = searchOneIn.readLine()) != null) {
			
			System.out.println(searchOneHTMLInput);
			
		}
		
		*/

	}

}
