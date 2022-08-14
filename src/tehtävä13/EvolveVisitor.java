package tehtävä13;

// ConcreteVisitor
public class EvolveVisitor implements Visitor {

	@Override
	public void visit(Ghastly ghastly, Pokemon pokemon) {
		if (pokemon.getEXP() >= 100) {
			System.out.println(".......");
			System.out.println("\nWhat? Ghastly is evolving!");
			System.out.println("\n.......");
			System.out.println("\n\n"
					+ "             -._                                   _.\r\n"
					+ "                \\ `-.._                           _,' |\r\n"
					+ "                 \\     `-._    _,.--------.._  _.\"    '\r\n"
					+ "                  \\        `--'              ``.     /\r\n"
					+ "                   \\                                j    __\r\n"
					+ "__         __       \\                               |.-\"' /\r\n"
					+ " `.`-.`-.__`.`'\"----\"\\                              |    /\r\n"
					+ "    `.       `.       '        ._                       /\r\n"
					+ "    `..        \\               | `.               /|   /\r\n"
					+ "      `.        `.             |   `._          .' |  /\r\n"
					+ "        `.  .-----`            |      `.       /   ' '\"\"''\r\n"
					+ "          `. `.            .    ._      `_    /  ,'    .'\r\n"
					+ "            `. `.           `._   `'\"\"'\"'     \"\"' ,  ,'\r\n"
					+ "              `. `.          `.`.              ,-/ ,'       _..\r\n"
					+ "                `. `.          \\|,---..  ,--\"./ / ,--------\".  \\\r\n"
					+ "                  `._           `.     `/ , .`.',:           \\  \\\r\n"
					+ "                     `._          `..\".,./ ' _.' :            \\  `.\r\n"
					+ "                   ,-'\" `-._              _.\"     .   |.-\"`.   \\  |\r\n"
					+ "                  .         `-..........-'        |   `..   \\   |_'\r\n"
					+ "                  |           `\".                 `.._   .  '  ,'\r\n"
					+ "                  |         |   |                     `\"'    .'\r\n"
					+ "                  |   /\\    |'  '\r\n"
					+ "                  '  /  \\   ||   .\r\n"
					+ "                 '   \\  '   |'   ;\r\n"
					+ "                  \\  '  \\   `...'\r\n"
					+ "                   `\"\"   `,' mh"
					+ "\n\n\n");
			System.out.println("Ghastly evolved into Haunter!\n");
			ghastly.evolve(pokemon, Haunter.getInstance());
		}	
	}

	@Override
	public void visit(Haunter haunter, Pokemon pokemon) {
		if (pokemon.getEXP() >= 250) {
			System.out.println(".......");
			System.out.println("\nWhat? Haunter is evolving!");
			System.out.println("\n.......");
			System.out.println("\n\n"
					+ "                 |`._         |\\\r\n"
					+ "                 `   `.  .    | `.    |`.\r\n"
					+ "                  .    `.|`-. |   `-..'  \\           _,.-'\r\n"
					+ "                  '      `-. `.           \\ /|   _,-'   /\r\n"
					+ "              .--..'        `._`           ` |.-'      /\r\n"
					+ "               \\   |                                  /\r\n"
					+ "            ,..'   '                                 /\r\n"
					+ "            `.                                      /\r\n"
					+ "            _`.---                                 /\r\n"
					+ "        _,-'               `.                 ,-  /\"-._\r\n"
					+ "      ,\"                   | `.             ,'|   `    `.\r\n"
					+ "    .'                     |   `.         .'  |    .     `.\r\n"
					+ "  ,'                       '   ()`.     ,'()  '    |       `.\r\n"
					+ "'-.                    |`.  `.....-'    -----' _   |         .\r\n"
					+ " / ,   ________..'     '  `-._              _.'/   |         :\r\n"
					+ " ` '-\"\" _,.--\"'         \\   | `\"+--......-+' //   j `\"--.. , '\r\n"
					+ "    `.'\"    .'           `. |   |     |   / //    .       ` '\r\n"
					+ "      `.   /               `'   |    j   /,.'     '\r\n"
					+ "        \\ /                  `-.|_   |_.-'       /\\\r\n"
					+ "         /                        `\"\"          .'  \\\r\n"
					+ "        j                                           .\r\n"
					+ "        |                                 _,        |\r\n"
					+ "        |             ,^._            _.-\"          '\r\n"
					+ "        |          _.'    `'\"\"`----`\"'   `._       '\r\n"
					+ "        j__     _,'                         `-.'-.\"`\r\n"
					+ "          ',-.,' mh"
					+ "\n\n\n");
			System.out.println("Haunter evolved into Gengar!\n");
			haunter.evolve(pokemon, Gengar.getInstance());
		}
		
	}

	@Override
	public void visit(Gengar gengar, Pokemon pokemon) {
		System.out.println("\nGengar can't evolve...\n");
	}
}