# In the 6G Era, Your Files May Be Less Secure Than in the 5G Era

## — Reflections on "Intelligent Connection of All Things" at the Future Network Development Conference in Nanjing

On October 15, the 10th Future Network Development Conference opened in Nanjing.

At the exhibition, a photonic terahertz communication chip achieved high-speed 100 Gbps transmission with dual polarization in the D-band, with successful field tests across a 26-kilometer link. A satellite networking control system realized full-process visualization for route recovery and rapid link establishment. The AI4S big science research cluster interconnected 11 major high-energy physics research facilities nationwide, enabling high-speed transfer of massive research data over distances of more than 2,000 kilometers.

These technological breakthroughs are tangible. Behind terms such as 6G, computing power networks, deterministic networks, and integrated communication and sensing, engineering advances are turning the concept of "intelligent connection of all things" into reality.

Yet as I walked through the exhibition booths along the corridor on the first floor, one question kept lingering in my mind:

**The faster data flows, the larger its scale, and the longer its transmission links — who safeguards data security while it is in transit?**

## A Contradiction Obscured by Speed

Over the past decade, upgrades to network infrastructure have far outpaced improvements in security infrastructure.

5G boosted data transmission rates by 10 to 100 times. However, the 35,467 new vulnerabilities uncovered in the 5G era (data for the first half of 2026) also exposed a much broader attack surface. 30.2% of high-risk vulnerabilities were weaponized and exploited on the day they were disclosed.

The cross-domain supercomputing pooling system showcased at the Future Network Development Conference lifted computing efficiency from 3.2% to 99.6%. This means computing resources can flow like water and electricity. But it also means your data may travel through infrastructure you know nothing about, pass through unknown computing nodes, and be copied, cached or analyzed without your knowledge.

This is no alarmist speculation. Incidents already recorded in 2026 bear witness:

- A Vietnam-linked database was exposed on the public internet, leaking over 220 million flight passenger records, including passport and travel data of numerous Chinese users.
- South Korean medical beauty platform "Gangnam Sister" leaked nearly 5,000 Chinese users’ surgical records, consultation reasons and photos.
- Times Car, Japan’s largest car-sharing operator, leaked data of 6.6 million users plus 1.6 million scanned driver’s licenses.
- US healthcare firm DaVita disclosed a breach affecting 2.68 million patients’ health records, resulting in a 100-million-yuan compensation payout.

These incidents share one common trait: **what was leaked was not "data in transit", but "data at rest".**
The breach occurred while data sat idle on a server, in a database or on a cloud platform.

When 6G enables data to flow at near-light speed, security weaknesses in storage will become even more pronounced. Data will land on more nodes, be handled by more systems, and be exposed to a greater number of potential attack vectors.

## The Security Paradox of Cloud Storage

Legacy cloud storage services — Baidu Netdisk, Google Drive, iCloud, Dropbox — sell convenience as their core value proposition: upload your files to the cloud and access or share them from any device.

Convenience comes at the cost of surrendering control. Your files are physically stored in the service provider’s data centers, and the provider holds the encryption keys, access policies and audit privileges.

This tradeoff was already concerning in the 5G era. The hack on Japan’s GSS proved that even government-grade data centers cannot guarantee absolute security.

In the 6G era, this bargain may become even less favorable, as data transmission links grow longer:

- Your files may no longer reside in a single data center, but be distributed and cached across multiple edge nodes.
- Your files may be automatically read and analyzed by AI systems to "optimize service experience".
- File synchronization across devices may pass through more relay nodes.
- Your files may move between different service providers far more frequently (think a digital version of multimodal transport).

Every additional node expands the attack surface, while your visibility and control over these nodes approach zero.

## "Zero-Knowledge" Is Not Marketing Hype

The core design philosophy of **DoraCloud** can be summed up in three words: **zero-knowledge.**

It is not merely "we promise not to look at your data" — a promise is an act of faith, not something verifiable.

It means "our architecture makes it impossible for us to view your data" — this is mathematics, not faith.

How is this achieved in practice?
**Client-side encryption:** Your files are encrypted locally on your device before upload. Only encrypted ciphertext is sent to DoraCloud servers.
**Local key management:** Encryption keys are generated and stored on your device. DoraCloud servers hold none of users’ decryption keys. Even if attackers compromise the server, they only obtain unintelligible ciphertext.
**Tiered storage:** DoraCloud separates your files into two layers:

- **Sensitive data layer:** High-sensitivity content such as ID cards, contracts, medical records and financial documents uses top-tier encryption. Keys remain fully local, and storage paths are completely isolated from other data on the server side.
- **General file layer:** Photos, documents and daily work files adopt an encryption scheme balancing security and performance, supporting cross-device synchronization and encrypted sharing.

The two tiers adopt distinct encryption strategies and storage paths. Your ID card photos and travel photos should not share the same security level. DoraCloud enables differentiated handling at the architectural level, rather than relying on superficial fixes like simple folder sorting.

**Transparent auditing:** DoraCloud publishes regular transparency reports, disclosing data requests, security incidents and system audit results. You cannot trust a black box — but you can trust a system open to inspection.

## What Does the Future Network Need?

At the exhibition in Nanjing, I saw many exciting technological breakthroughs:
Terahertz communication delivers unimaginably fast data transmission. Computing power networks make computing resources available on demand, like water and electricity. AI4S boosts the efficiency of scientific research collaboration by multiple orders of magnitude. Trusted security token operation platforms mitigate the risk of large model shelling attacks. Mimic defense agents and AI-powered automated penetration testing bots represent a new generation of cybersecurity tools.

These technologies solve the problem of enabling data to flow faster and more intelligently.

Yet the question of **how data can be securely stored and controlled** calls for a separate set of solutions. Control must be returned from platforms to users. Encryption should happen the moment data is created, not at some arbitrary point during transmission. Zero-knowledge architecture needs to become the default, not an optional add-on feature.

**DoraCloud aims to be one missing piece in the security infrastructure.**
It is not meant to replace 6G, computing power networks, or any transport-layer technical innovation. In a world where data flows ever faster, it offers users a fully trusted digital vault: your data is encrypted on your device, decrypted on your device, and stays under your control.

Whether networks upgrade from 5G to 6G or 7G, and whether computing shifts from the cloud to the edge or back to central hubs, this fundamental principle remains unchanged:
**You own the final say over your files.**

A slogan at the exhibition of the Future Network Development Conference stuck with me: *Intelligent connection of all things, built on security.*

That statement holds true. But the definition of security needs to shift from "the service provider protects your data" to "you control your data".

The former relies on trust. The latter grants power.

In an age where data is the most valuable asset, power is more reliable than trust.

**DoraCloud — You own the final say over your files.**

*DoraCloud is one product in the Dora series, focusing on secure storage for sensitive private data and general files.*