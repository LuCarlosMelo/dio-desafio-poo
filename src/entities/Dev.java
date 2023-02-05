package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String name;
	private Set<Content> subscribedContents = new LinkedHashSet<>();
	private Set<Content> councludedContents = new LinkedHashSet<>();

	public void registerBootcamp(Bootcamp bootcamp) {
		this.subscribedContents.addAll(bootcamp.getContents());
		bootcamp.getSubscribedDevs().add(this);
	}

	public void progress() {
		Optional<Content> content = this.subscribedContents.stream().findFirst();
		if (content.isPresent()) {
			this.councludedContents.add(content.get());
			this.subscribedContents.remove(content.get());
		} else {
			System.out.println("Você nã está matriculad em nenhum conteúdo");
		}

	}

	public double calculateTotalXp() {
		return this.councludedContents
				.stream()
				.mapToDouble(Content::calculator)
				.sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContents() {
		return subscribedContents;
	}

	public void setSubscribedContents(Set<Content> subscribedContents) {
		this.subscribedContents = subscribedContents;
	}

	public Set<Content> getCouncludedContents() {
		return councludedContents;
	}

	public void setCouncludedContents(Set<Content> councludedContents) {
		this.councludedContents = councludedContents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(councludedContents, name, subscribedContents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(councludedContents, other.councludedContents) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContents, other.subscribedContents);
	}

}
