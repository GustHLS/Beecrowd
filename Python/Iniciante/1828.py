T = int(input())
for i in range(T):
    jogada1, jogada2 = input().split()

    match jogada1:
        case "tesoura":
            match jogada2:
                case "papel":
                    print(f"Caso #{i+1}: Bazinga!")
                case "lagarto":
                    print(f"Caso #{i+1}: Bazinga!")
                case "Spock":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case "pedra":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case _:
                    print(f"Caso #{i+1}: De novo!")

        case "papel":
            match jogada2:
                case "pedra":
                    print(f"Caso #{i+1}: Bazinga!")
                case "Spock":
                    print(f"Caso #{i+1}: Bazinga!")
                case "tesoura":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case "lagarto":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case _:
                    print(f"Caso #{i+1}: De novo!")

        case "pedra":
            match jogada2:
                case "lagarto":
                    print(f"Caso #{i+1}: Bazinga!")
                case "tesoura":
                    print(f"Caso #{i+1}: Bazinga!")
                case "papel":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case "Spock":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case _:
                    print(f"Caso #{i+1}: De novo!")
        case "Spock":
            match jogada2:
                case "pedra":
                    print(f"Caso #{i+1}: Bazinga!")
                case "tesoura":
                    print(f"Caso #{i+1}: Bazinga!")
                case "papel":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case "lagarto":
                    print(f"Caso #{i+1}: Raj trapaceou!")
                case _:
                    print(f"Caso #{i+1}: De novo!")

        case "lagarto":
            match jogada2:
                case "Spock":
                    print(f"Caso #{i + 1}: Bazinga!")
                case "papel":
                    print(f"Caso #{i + 1}: Bazinga!")
                case "pedra":
                    print(f"Caso #{i + 1}: Raj trapaceou!")
                case "tesoura":
                    print(f"Caso #{i + 1}: Raj trapaceou!")
                case _:
                    print(f"Caso #{i + 1}: De novo!")
