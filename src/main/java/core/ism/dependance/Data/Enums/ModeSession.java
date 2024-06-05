package core.ism.dependance.Data.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ModeSession {

    enLigne(0),
    enPresentiel(1);

    private final long index;
}
