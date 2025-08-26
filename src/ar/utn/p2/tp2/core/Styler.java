package ar.utn.p2.tp2.core;

public interface Styler {
    enum Ctx { TITLE, INFO, WARN, SUCCESS, ERROR, HINT, DEFAULT }
    String fmt(Ctx ctx, String text);
    default void println(Ctx ctx, String text){ System.out.println(fmt(ctx, text)); }
    default void print(Ctx ctx, String text)  { System.out.print(fmt(ctx, text)); }
}