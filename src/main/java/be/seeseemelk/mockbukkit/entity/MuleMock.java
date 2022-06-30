package be.seeseemelk.mockbukkit.entity;

import be.seeseemelk.mockbukkit.ServerMock;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Mule;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class MuleMock extends ChestedHorseMock implements Mule
{

	public MuleMock(@NotNull ServerMock server, @NotNull UUID uuid)
	{
		super(server, uuid);
	}

	@Override
	public Horse.@NotNull Variant getVariant()
	{
		return Horse.Variant.MULE;
	}

}