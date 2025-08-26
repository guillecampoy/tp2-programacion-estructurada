package ar.utn.p2.tp2.adapters;

import ar.utn.p2.tp2.core.Styler;
import ar.utn.p2.tp2.utils.ContextColor;
import ar.utn.p2.tp2.utils.UtilsColor;

public class UtilsColorStyler implements Styler {

    private static ContextColor map(Ctx c) {
        return switch (c) {
            case SUCCESS -> ContextColor.SUCCESS;
            case ERROR -> ContextColor.ERROR;
            case WARN -> ContextColor.WARNING;
            case INFO, HINT, TITLE -> ContextColor.INFO;   // mapeo razonable
            case DEFAULT -> ContextColor.DEFAULT;
        };
    }
    @Override
    public String fmt(Ctx ctx, String text) {
        // Usamos UtilsColor para imprimir (side-effect) y además devolvemos el texto “plano”
        // para cumplir el contrato. Si querés solo side-effect, podés retornar text tal cual.
        UtilsColor.imprimirResultados(map(ctx), text);
        return text;
    }
}
