# The Day Satellites Launched, I Thought of All Those Unencrypted Files

## As data starts orbiting the Earth, are your files ready to “go to space”?

A little past 3 a.m. yesterday at the Hainan Commercial Space Launch Site, the Long March 12 rocket sent the 27th batch of low-orbit satellite internet satellites into orbit.

The news snippet was short, just a few dozen words. But the implications are enormous — China’s low-earth-orbit satellite internet network is expanding at a rate of 2 to 3 batches per month. Combined with SpaceX’s Starlink, OneWeb and Amazon’s Project Kuiper, more than 10,000 communication satellites are already operating in near-Earth orbit.

What does this mean?

It means that in the not-too-distant future, every piece of data on your phone — messages, photos, documents, videos — may travel via satellites 500 kilometres overhead. Signals will no longer rely solely on terrestrial base stations and optical fibres. Instead, they will pierce the atmosphere and bounce through the vacuum of space at the speed of light.

This marks a leap in digital infrastructure. Yet with this leap comes a critical shift: **the route your data travels is no longer entirely within your country’s jurisdiction.**

A single satellite can cover territories spanning multiple nations and legal domains. As your data packets hop between satellites, whose jurisdiction do they pass through? Who has the authority to inspect them? Who safeguards them?

No one can give you a definitive answer to this question right now.

## Where Are Your Files Stored Today?

Set satellites aside for a moment. Let’s look at the present reality.

Where physically sits the data centre holding the files you uploaded to your cloud drive?

Chances are you have no idea. It could be inside a cave in Guizhou (many cloud providers build data centres there thanks to low electricity costs and cool temperatures), on a grassland in Inner Mongolia, or a mirrored backup on some overseas node you’ve never heard of.

Your files are “on the cloud”. But where *is* the cloud? You don’t know. Who manages that data centre? You don’t know. Do data centre staff have permission to view your files? Again, you don’t know.

There is only one thing you can do: trust. Trust the provider’s security systems, trust the integrity of their employees, trust their privacy policies.

But events in 2026 keep proving one thing: **trust alone is not enough.**

Back in August this year, US firm CareCloud confirmed hackers stole complete medical records belonging to 3.75 million patients. The data sat on a “secure cloud”, operated by a public company and regulated under HIPAA. Still, it was breached.

In September, South Korea’s five major commercial banks suffered a synchronised AI-powered hack. Sensitive data including annual income and loan limits of 25,000 customers was stolen. Twenty-five hours — more than a full day — passed before the banks detected the intrusion.

In October, a spokesperson for China’s Ministry of Foreign Affairs publicly noted that “data poisoning using new technologies” has emerged as a new tactic to distort history. State actors are exploiting vulnerabilities in data storage, so how much easier would it be for attackers targeting ordinary people’s files?

## What Does “Data Sovereignty” Mean for *You*?

You may think “data sovereignty” is a state-level concept — a grand topic debated between nations over cross-border data flows and data localisation requirements.

But its most tangible meaning lands on every individual: **You are in charge of your own data.**

Who gets to view your files? You decide.
Who can decrypt your photos? You decide.

You may not be able to fully control where your data is stored, which route it takes or which nodes it passes through. But at the very minimum — the power to encrypt should rest in your hands.

DoraCloud was built around this core philosophy.

It is not a cloud drive in the traditional sense. If all you need is a tool to store files and generate share links, there are dozens of alternatives on the market. DoraCloud aims to solve a more fundamental problem: **to ensure your files are encrypted the moment they leave your phone, and only you can decrypt them.**

Specifically, it delivers several distinctive capabilities:

**Client-side encryption.** Files are encrypted locally on your device before upload. Encryption keys remain exclusively on your device. The server never touches plaintext data and never stores your keys. Even if the server is compromised, attackers only obtain ciphertext — meaningless bytes without the corresponding key.

**Partitioned storage management.** DoraCloud features two built-in storage spaces: a General Zone and a Privacy Zone. Store family photos, work documents and travel videos in the General Zone for convenient daily sync and sharing. Save scanned ID documents, bank statements, contracts and medical reports in the Privacy Zone — it uses independent encryption and separate access controls, adding an extra layer of protection.

Think of it like your home: the living room is an open space accessible to guests, while your safe is a private vault whose password only you know. DoraCloud brings this common-sense logic into the digital world.

**Decentralised storage architecture.** It does not rely on a single data centre. Files are split into fragments, encrypted, then distributed across multiple nodes. No individual node can reconstruct the complete file. This eliminates the risk of “breach one data centre, steal all your data”.

## This Will Grow Even More Critical Once Satellite Internet Goes Mainstream

Let’s return to satellites.

Low-orbit satellite internet boasts broad coverage: internet access is available in deserts, oceans, aboard aircraft and remote mountain regions. Yet it introduces a new challenge: the physical path data takes when relayed between satellites becomes far harder to control.

A message sent from China may be relayed by a satellite registered in Luxembourg, routed via a ground station in Chile, before reaching its destination. Along this journey, the data crosses multiple jurisdictions, each with its own data protection laws.

In this scenario, transport-layer encryption (TLS) only shields data from eavesdropping during transmission. But what if the receiving server itself is insecure? What if the server operator is compelled to hand over user data?

There is only one solution: **encrypt at the source and decrypt only at the endpoint; keep data as ciphertext throughout transit.**
Encryption and decryption happen solely on your devices. Servers, satellites and ground stations will always see nothing but encrypted data.

That is the architectural logic behind DoraCloud. Whether your data travels over optical fibre or satellite links, its security does not depend on the transmission path — it depends on the key held in your possession.

## Something Worth Trying

You can test this today.

Open your current cloud drive and look through the files you would never want strangers to see. ID photos? Scanned driver’s licences? Corporate financial statements? Emails exchanged with your lawyer?

Then ask yourself one question: what would happen if this cloud provider’s servers got hacked tomorrow?

If the answer is “everything would be fully exposed” — it may be time to move those files somewhere safer.

You don’t need to abandon your existing cloud storage. Mainstream cloud drives remain the most convenient choice for everyday files, shared content and collaborative work. But for truly sensitive files, content you never want any third party to access — give them an encrypted home.

Satellites are already in orbit. The paths our data travels will grow longer and more complex.

But there should always be just one key to your files.

And that key should belong to you.