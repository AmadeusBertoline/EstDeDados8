package controller;

public class DivController {

	public int Divisao(int divd, int divis) {

		if (divd - divis < 0) {

			return divd;

		}

		return Divisao(divd - divis, divis);

	}
}
